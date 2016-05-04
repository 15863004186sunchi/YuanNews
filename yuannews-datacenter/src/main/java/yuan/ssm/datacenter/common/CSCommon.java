package yuan.ssm.datacenter.common;

import yuan.ssm.datacenter.base.SourceEnum;

/**
 * ==================================================
 * <p/>
 * 版权：　软件工程.net12-1 原明卓
 * <p/>
 * 项目：　基于用户兴趣标签的新闻推荐系统
 * <p/>
 * 作者：　原明卓
 * <p/>
 * 版本：　1.0
 * <p/>
 * 创建日期：　16-5-4 下午4:02
 * <p/>
 * 功能描述： 分类工具类
 * 1.虎嗅
 * 2.环球
 * 3.
 * <p>
 * <p/>
 * 功能更新历史：
 * <p>
 * ==================================================
 */
public class CSCommon {

    public static int getSourceId(SourceEnum word){
        switch (word){
            case huxiu:
                return 8;
            case huanqiu:
                return 9;
            default:
                return 0;
        }
    }

    public static int getCateId(SourceEnum word){
        switch (word){
            case huxiu:
                return 13;
            case huanqiu:
                return 9;
        }
        return 0;
    }

}