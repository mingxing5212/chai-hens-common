package me.mingxing5212.chaihens.eggs.bind;

import java.util.Iterator;

import me.mingxing5212.chaihens.eggs.PageFilter;
import me.mingxing5212.chaihens.eggs.Seed;
import me.mingxing5212.chaihens.eggs.SeedParameter;
import me.mingxing5212.chaihens.eggs.annotation.SeedParam;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

import javax.servlet.http.HttpServletRequest;


public class SeedParamMethodArgumentResolver implements HandlerMethodArgumentResolver{

	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		if(parameter.hasParameterAnnotation(SeedParam.class)){
			return true;
		}
		return false;
	}

	/**
	 * The arguments could be "page", "pagesize", "order" or the filters.
	 */
	@Override
	public Object resolveArgument(MethodParameter parameter,
			ModelAndViewContainer mavContainer, NativeWebRequest webRequest,
			WebDataBinderFactory binderFactory) throws Exception {
		@SuppressWarnings("rawtypes")
		Seed seed = new Seed();
		PageFilter pageFilter = new PageFilter();
		for(Iterator<String> paramNameItr = webRequest.getParameterNames();paramNameItr.hasNext();){
			String paramName = paramNameItr.next();
			if(paramName.equals(SeedParameter.PAGE_NUMBER)){
				seed.setPageNumber(Integer.parseInt(webRequest.getParameter(paramName)));
			}else if(paramName.equals(SeedParameter.PAGE_SIZE)){
				seed.setPageSize(Integer.parseInt(webRequest.getParameter(paramName)));
			}else if(paramName.equals(SeedParameter.ORDER)){
				seed.setOrder(webRequest.getParameter(paramName));
			}else{
				pageFilter.add(paramName, webRequest.getParameter(paramName));
			}
		}
		seed.setActionPath(webRequest.getNativeRequest(HttpServletRequest.class).getRequestURI());
		seed.setPageFilter(pageFilter);

		int pageNumber = seed.getPageNumber();
		int start = (pageNumber -1) * 2;
		int end = pageNumber * 2;

		seed.setStart(start);
		seed.setEnd(end);
		return seed;
	}

}
