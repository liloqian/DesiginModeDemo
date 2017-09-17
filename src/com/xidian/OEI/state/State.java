package com.xidian.OEI.state;

/**
 * Created by leo on 2017/9/17.
 */
/**State接口，所有的状态（固液气）都要继承他*/
public interface State {
    public void warm();
    public void liquidation();
    public void sloiding();
}
