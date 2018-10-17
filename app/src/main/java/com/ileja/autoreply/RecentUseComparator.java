package com.ileja.autoreply;

import android.app.usage.UsageStats;

import java.util.Comparator;

 class RecentUseComparator implements Comparator<UsageStats> {
    @Override
    public int compare(UsageStats lhs, UsageStats rhs) {
        return (lhs.getLastTimeUsed() > rhs.getLastTimeUsed()) ? -1 : (lhs.getLastTimeUsed() == rhs.getLastTimeUsed()) ? 0 : 1;
    }
}
