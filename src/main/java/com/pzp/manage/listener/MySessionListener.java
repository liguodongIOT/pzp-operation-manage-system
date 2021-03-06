package com.pzp.manage.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * <p>Project: pzp-operation-manage-system</p>
 * <p>Package: com.pzp.manage.listener</p>
 * <p>Title: 监听Session的创建与销毁 </p>
 * <p>Description: </p>
 *
 * @author guodong.li
 * @version 1.0.0
 * @date 2018/2/5 20:35 星期一
 */
@WebListener
public class MySessionListener implements HttpSessionListener,HttpSessionAttributeListener {

    private static final Logger LOGGER = LoggerFactory.getLogger(MySessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOGGER.info("Session被创建, SessionId:{}。",se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        LOGGER.info("Session 被销毁, SessionId:{}。", se.getSession().getId());
    }


    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        LOGGER.info("Session被增加, SessionId:{}，name:{},value:{}。", se.getSession().getId(), se.getName(), se.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        LOGGER.info("Session被移除, SessionId:{}，name:{},value:{}。", se.getSession().getId(), se.getName(), se.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        LOGGER.info("Session被替换, SessionId:{}，name:{},value:{}。", se.getSession().getId(), se.getName(), se.getValue());
    }
}
