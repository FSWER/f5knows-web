package com.f5knows.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
public class Weather {


    private List<HeWeather6Bean> HeWeather6;

    @NoArgsConstructor
    @Data
    public static class HeWeather6Bean {
        /**
         * basic : {"cid":"CN101010100","location":"北京","parent_city":"北京","admin_area":"北京","cnty":"中国","lat":"39.90498734","lon":"116.4052887","tz":"+8.00"}
         * update : {"loc":"2019-03-17 14:55","utc":"2019-03-17 06:55"}
         * status : ok
         * now : {"cloud":"0","cond_code":"100","cond_txt":"晴","fl":"15","hum":"17","pcpn":"0.0","pres":"1018","tmp":"19","vis":"15","wind_deg":"214","wind_dir":"西南风","wind_sc":"3","wind_spd":"16"}
         * daily_forecast : [{"cond_code_d":"100","cond_code_n":"101","cond_txt_d":"晴","cond_txt_n":"多云","date":"2019-03-17","hum":"30","mr":"13:47","ms":"03:47","pcpn":"0.0","pop":"0","pres":"1007","sr":"06:21","ss":"18:24","tmp_max":"20","tmp_min":"4","uv_index":"5","vis":"25","wind_deg":"207","wind_dir":"西南风","wind_sc":"3-4","wind_spd":"19"},{"cond_code_d":"101","cond_code_n":"100","cond_txt_d":"多云","cond_txt_n":"晴","date":"2019-03-18","hum":"27","mr":"14:58","ms":"04:38","pcpn":"0.0","pop":"0","pres":"1002","sr":"06:19","ss":"18:25","tmp_max":"21","tmp_min":"6","uv_index":"4","vis":"25","wind_deg":"136","wind_dir":"东南风","wind_sc":"1-2","wind_spd":"2"},{"cond_code_d":"101","cond_code_n":"104","cond_txt_d":"多云","cond_txt_n":"阴","date":"2019-03-19","hum":"66","mr":"16:13","ms":"05:23","pcpn":"0.0","pop":"0","pres":"1000","sr":"06:18","ss":"18:26","tmp_max":"24","tmp_min":"11","uv_index":"1","vis":"24","wind_deg":"179","wind_dir":"南风","wind_sc":"3-4","wind_spd":"18"}]
         * lifestyle : [{"type":"comf","brf":"舒适","txt":"白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。"},{"type":"drsg","brf":"较舒适","txt":"建议着薄外套、开衫牛仔衫裤等服装。年老体弱者应适当添加衣物，宜着夹克衫、薄毛衣等。"},{"type":"flu","brf":"较易发","txt":"昼夜温差较大，较易发生感冒，请适当增减衣服。体质较弱的朋友请注意防护。"},{"type":"sport","brf":"较适宜","txt":"天气较好，但因风力稍强，户外可选择对风力要求不高的运动，推荐您进行室内运动。"},{"type":"trav","brf":"适宜","txt":"天气较好，风稍大，但温度适宜，是个好天气哦。适宜旅游，您可以尽情地享受大自然的无限风光。"},{"type":"uv","brf":"中等","txt":"属中等强度紫外线辐射天气，外出时建议涂擦SPF高于15、PA+的防晒护肤品，戴帽子、太阳镜。"},{"type":"cw","brf":"较适宜","txt":"较适宜洗车，未来一天无雨，风力较小，擦洗一新的汽车至少能保持一天。"},{"type":"air","brf":"良","txt":"气象条件有利于空气污染物稀释、扩散和清除，可在室外正常活动。"}]
         */

        private BasicBean basic;
        private UpdateBean update;
        private String status;
        private NowBean now;
        private List<DailyForecastBean> daily_forecast;
        private List<LifestyleBean> lifestyle;

        @NoArgsConstructor
        @Data
        public static class BasicBean {
            /**
             * cid : CN101010100
             * location : 北京
             * parent_city : 北京
             * admin_area : 北京
             * cnty : 中国
             * lat : 39.90498734
             * lon : 116.4052887
             * tz : +8.00
             */

            private String cid;
            private String location;
            private String parent_city;
            private String admin_area;
            private String cnty;
            private String lat;
            private String lon;
            private String tz;
        }

        @NoArgsConstructor
        @Data
        public static class UpdateBean {
            /**
             * loc : 2019-03-17 14:55
             * utc : 2019-03-17 06:55
             */

            private String loc;
            private String utc;
        }

        @NoArgsConstructor
        @Data
        public static class NowBean {
            /**
             * cloud : 0
             * cond_code : 100
             * cond_txt : 晴
             * fl : 15
             * hum : 17
             * pcpn : 0.0
             * pres : 1018
             * tmp : 19
             * vis : 15
             * wind_deg : 214
             * wind_dir : 西南风
             * wind_sc : 3
             * wind_spd : 16
             */

            private String cloud;
            private String cond_code;
            private String cond_txt;
            private String fl;
            private String hum;
            private String pcpn;
            private String pres;
            private String tmp;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;
        }

        @NoArgsConstructor
        @Data
        public static class DailyForecastBean {
            /**
             * cond_code_d : 100
             * cond_code_n : 101
             * cond_txt_d : 晴
             * cond_txt_n : 多云
             * date : 2019-03-17
             * hum : 30
             * mr : 13:47
             * ms : 03:47
             * pcpn : 0.0
             * pop : 0
             * pres : 1007
             * sr : 06:21
             * ss : 18:24
             * tmp_max : 20
             * tmp_min : 4
             * uv_index : 5
             * vis : 25
             * wind_deg : 207
             * wind_dir : 西南风
             * wind_sc : 3-4
             * wind_spd : 19
             */

            private String cond_code_d;
            private String cond_code_n;
            private String cond_txt_d;
            private String cond_txt_n;
            private String date;
            private String hum;
            private String mr;
            private String ms;
            private String pcpn;
            private String pop;
            private String pres;
            private String sr;
            private String ss;
            private String tmp_max;
            private String tmp_min;
            private String uv_index;
            private String vis;
            private String wind_deg;
            private String wind_dir;
            private String wind_sc;
            private String wind_spd;
        }

        @NoArgsConstructor
        @Data
        public static class LifestyleBean {
            /**
             * type : comf
             * brf : 舒适
             * txt : 白天不太热也不太冷，风力不大，相信您在这样的天气条件下，应会感到比较清爽和舒适。
             */

            private String type;
            private String brf;
            private String txt;
        }
    }
}
