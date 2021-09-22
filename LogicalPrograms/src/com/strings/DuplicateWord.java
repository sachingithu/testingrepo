package com.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateWord {

	public static void main(String[] args) {
		String str=" Java Is The best Language Java Is Java";
		String []word=str.split(" ");
		Map<String, Integer> m=new HashMap<>();
		for(String w:word) {
			if(m.get(w)==null) {
				m.put(w, 1);
			}else {
				m.put(w, m.get(w)+1);
			}
			Iterator<String> itr=m.keySet().iterator();
			while(itr.hasNext()) {
				String temp=itr.next();
				if(m.get(temp)>1) {
					System.out.println(temp +" : "+m.get(temp));
				}
			}
		}

	}

}
