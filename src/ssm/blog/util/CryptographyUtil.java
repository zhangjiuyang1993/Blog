package ssm.blog.util;

import org.apache.shiro.crypto.hash.Md5Hash;

//md5加密工具类
public class CryptographyUtil {
	//使用Shrio的md5加密
	public static String md5(String str, String salt){
		//Md5是shrio中的一个方法
		return new Md5Hash(str, salt).toString();
	}
	
	//我自己生成一下测试用的
	public static void main(String[] args){
		String password = "123456";
		System.out.println("Md5加密： " + CryptographyUtil.md5(password, "javacoder"));
	}
}
