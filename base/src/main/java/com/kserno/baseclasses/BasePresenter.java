package com.kserno.baseclasses;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by filipsollar on 4.4.18.
 */

public abstract class BasePresenter<Screen> implements IBasePresenter {

    private Screen mScreen;

    public BasePresenter(Screen screen) {
        checkNotNull(screen);
        mScreen = screen;
    }

    /**
     * used to initialize things that cannot be initialized in presenter
     */
    public abstract void start();

    /**
     * used when view is destroyed
     */
    public abstract void stop();

    protected Screen getScreen() {
        return mScreen;
    }

}
