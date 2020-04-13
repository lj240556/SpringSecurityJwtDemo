package com.company.project.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author  LiuJiang
 * @create  2020/3/6 14:05
 * @desc  将两个List<Map<String,String>>中的第一个map的value作为新map的key，将第二个map的value作为新map的value，返回新的map
 **/
public class TwoMapReverseKeyValue {

    public static List<Map<String,String>> TwomapReverse(List<Map<String,Object>> mapListInfo,List<Map<String,Object>> mapListReal){

        //页面所需的Vo对象
        List<Map<String, String>> Vomap = new ArrayList<>();

        //遍历data信息
        for (Map<String, Object> OneData : mapListReal) {

            //遍历info信息
            //进行infodata表中和realdata表中的数据项进行匹配
            for (Map<String, Object>   OneInfo : mapListInfo)
                if (OneInfo.get("stationnum").toString().equals(OneData.get("stationnum").toString()) &&
                        OneInfo.get("devID").toString().equals(OneData.get("devID").toString())) {
                    Map<String, String> Vomap1 = new HashMap<>();

                    //匹配成功后，取出对应的flag，拼接item字段
                    Object flagObj = OneInfo.get("flag");
                    Integer flag = Integer.valueOf(flagObj.toString());
                    for (int i = 0; i < flag; i++) {
                        String item = Pingjie3(i);
                        //新的key
                        String key="";
                        if (null==OneInfo.get(item)){
                            key=item;
                        }else{
                         key = OneInfo.get(item).toString();
                        }

                        String value = "";
                        if (null == OneData.get(item)) {
                            value = "";
                        } else {
                            //新的value
                            value = OneData.get(item).toString();
                        }

                        //放入Vo中
                        Vomap1.put(key, value);
                    }
                    Vomap1.put("stationnum", OneData.get("stationnum").toString());
                    Vomap1.put("devID", OneData.get("devID").toString());
                    Vomap1.put("devname", OneData.get("devname").toString());
                    Vomap1.put("flag", OneInfo.get("flag").toString());
                    //进行非空判断   数据库没有数据的时候 会报空指针异常 并不会返回“”空字符串
                    if (null == OneData.get("devtime")) {
                        Vomap1.put("devtime", "");
                    } else {
                        Vomap1.put("devtime", OneData.get("devtime").toString());
                    }
                    if (null == OneData.get("curtime")) {
                        Vomap1.put("curtime", "");
                    } else {
                        Vomap1.put("curtime", OneData.get("curtime").toString());
                    }
                    if (null == OneData.get("reip")) {
                        Vomap1.put("reip", "");
                    } else {
                        Vomap1.put("reip", OneData.get("reip").toString());
                    }
                    if (null == OneData.get("dim")) {
                        Vomap1.put("dim", "");
                    } else {
                        Vomap1.put("dim", OneData.get("dim").toString());
                    }
                    if (null == OneData.get("alt")) {
                        Vomap1.put("alt", "");
                    } else {
                        Vomap1.put("alt", OneData.get("alt").toString());
                    }
                    if (null == OneData.get("lon")) {
                        Vomap1.put("lon", "");
                    } else {
                        Vomap1.put("lon", OneData.get("lon").toString());
                    }
                    Vomap.add(Vomap1);
                }
        }
        return Vomap;
    }

    //拼接item字段
    public  static  String Pingjie3(int flag){
        if (flag<10){
            String item="item0"+flag;
            return  item;
        }
        String item2="item"+flag;
        return  item2;
    }
}
