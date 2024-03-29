package io.github.eventbus.core.terminal;

import java.io.Serializable;
import java.net.URL;

/**
 * @author ALi
 * @version 1.0
 * @date 2022-06-01 14:52
 * @description
 */
public class Terminal implements Serializable {
    private String name;
    private URL url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("[name=").append(name)
                .append(",url=").append(url).append("]")
                .toString();
    }
}
