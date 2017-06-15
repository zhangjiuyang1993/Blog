package ssm.blog.util;

import java.util.ArrayList;
import java.util.List;

//�ַ���������
public class StringUtil {
	//�ж��Ƿ��ǿ�
	public static boolean isEmpty(String str){
		if(str == null || "".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	//�ж��Ƿ��ǿ�
	public static boolean isNotEmpty(String str){
		if(str != null && !"".equals(str.trim())){
			return true;
		}else{
			return false;
		}
	}
	
	//��ʽ��ģ����ѯ
	public static String formatLike(String str){
		if(isNotEmpty(str)){
			return "%" + str + "%";
		}else{
			return null;
		}
	}
	
	//���˵�������Ŀո�
	public static List<String> filterWhite(List<String> list){
		List<String> resultList = new ArrayList<String>();
		for(String l : list){
			if(isNotEmpty(l)){
				resultList.add(l);
			}
		}
		return resultList;
	}
}
