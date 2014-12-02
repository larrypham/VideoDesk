package com.techiedb.app.videodesk;

import android.util.Log;

/**
 * Copyright (C) 2014 Adways Vietnam Inc . All rights reserved.
 * Mobile UX Promotion Division.
 * This software and its documentation are confidential and proprietary
 * information of Adways Vietnam Inc .  No part of the software and
 * documents may be copied, reproduced, transmitted, translated, or reduced to
 * any electronic medium or machine-readable form without the prior written
 * consent of Adways Vietnam Inc.
 * Adways Vietnam Inc makes no representations with respect to the contents,
 * and assumes no responsibility for any errors that might appear in the
 * software and documents. This publication and the contents hereof are subject
 * to change without notice.
 * History
 *
 * @author Larry Pham(larrypham.vn@gmail.com)
 * @since November.23.2014
 */
public class ActionCounter {
    public static final String TAG = AppConstant.PREFIX + ActionCounter.class.getSimpleName();
    private int mAcountCount = 0;

    public synchronized void onIncrease(){
        this.mAcountCount++;
        Log.d(TAG, String.format("ActionCount was increased: %d", this.mAcountCount));
    }

    public synchronized void onDecrease(){
        this.mAcountCount--;
        Log.d(TAG, String.format("ActionCount was gained: %d", this.mAcountCount));
    }

    public synchronized void onReset(){
        this.mAcountCount =0;
        Log.d(TAG,String.format("ActionCount was reset, %d", this.mAcountCount));
    }

    public synchronized int getCount(){
        Log.d(TAG, String.format("Current Count: %d", this.mAcountCount));
        return this.mAcountCount;
    }
}
