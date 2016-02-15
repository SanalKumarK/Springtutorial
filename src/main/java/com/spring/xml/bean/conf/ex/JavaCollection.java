package com.spring.xml.bean.conf.ex;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by kurunsk on 15-02-2016.
 */
public class JavaCollection {

    private List list;
    private Set set ;
    private Map addMap;
    private Properties props;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map getAddMap() {
        return addMap;
    }

    public void setAddMap(Map addMap) {
        this.addMap = addMap;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }
}
