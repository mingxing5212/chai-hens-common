package me.mingxing5212.chaihens.eggs.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * <p>绑定前端datatable传回的参数</p>
 * <pre>
 * 	@RequestMapping("list")
	public @ResponseBody JData list( @DataTableParam DataTableParameter param ){
	...
	}
 * </pre>
 * @author wangzhen
 * 
 */
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataTableParam {

}
