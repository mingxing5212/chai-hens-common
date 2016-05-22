package me.mingxing5212.chaihens.eggs.utils;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class HttpClientUtils {
	
	/** 最大连接数*/
	private static final int MAX_CONNECTION_TOTAL = 300;
	/** 路由并发数*/
	private static final int ROUTE_MAX_COUNT = 200;
	/** 重试次数*/
	private static final int RETRY_COUNT = 3;
	/** 连接超时*/
	private static final int CONNECTION_TIME_OUT = 4000;
	/** 数据超时*/
	private static final int READ_TIME_OUT = 5000;
	/** 连接等待*/
	private static final int CONNECTION_REQUEST_TIME_OUT = 5000;
	/** 编码*/
	private static final String CHARSET = "UTF-8";

	/**
	 * JSON数据格式的POST请求
	 * @param url
	 * @param requestBody
	 * @param responseType
	 * @param <T>
	 * @return
	 * @throws Exception
	 */
	public static <T> T postForObject(String url, Object requestBody, Class<T> responseType) throws Exception {
		HttpClient httpClient = getHttpClient();
		HttpPost httpPost = new HttpPost(url);
		httpPost.addHeader("Content-Type", "application/json;charset=UTF-8");
		HttpEntity entity = null;
		try {
			httpPost.setEntity(new StringEntity(new ObjectMapper().writeValueAsString(requestBody), CHARSET));
			HttpResponse response = httpClient.execute(httpPost);
			entity = response.getEntity();
			String responseBody = EntityUtils.toString(entity, CHARSET);
			return new ObjectMapper().readValue(responseBody, responseType);
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				EntityUtils.consume(entity);
			} catch (IOException e) {
				throw e;
			}
		}
	}

	public static <T> T getForObject(String url, Class<T> responseType) throws Exception{
		HttpClient httpClient = getHttpClient();
		HttpGet httpGet = new HttpGet(url);
		httpGet.addHeader("Content-Type", "application/json;charset=UTF-8");
		HttpEntity entity = null;
		try {
			HttpResponse response = httpClient.execute(httpGet);
			entity = response.getEntity();
			String responseBody = EntityUtils.toString(entity, CHARSET);
			return new ObjectMapper().readValue(responseBody, responseType);
		} catch (IOException e) {
			throw e;
		} finally {
			try {
				EntityUtils.consume(entity);
			} catch (IOException e) {
				throw e;
			}
		}
	}

	public static HttpClient getHttpClient() {
		HttpClient httpClient = HttpClientBuilder.create().build();
		return httpClient;
	}

	public static String post(String url, String data) {
		return null;
	}

	public static String get(String url){
		return null;
	}

	public static String postFile(String url,File file){
		return null;
	}

	public static String postFile(String url,String name,File file){
		return null;
	}

	public static byte[] getFile(String url){
		return null;
	}
}
