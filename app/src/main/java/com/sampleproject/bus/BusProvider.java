package com.sampleproject.bus;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by ZkHaider on 8/10/15.
 */
public final class BusProvider {

    private static final Bus BUS = new Bus(ThreadEnforcer.ANY);

    public static Bus getInstance() {
        return BUS;
    }

    private BusProvider() {
    }

}