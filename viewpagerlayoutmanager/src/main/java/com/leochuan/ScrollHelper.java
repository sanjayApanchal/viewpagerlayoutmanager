package com.leochuan;


import androidx.recyclerview.widget.RecyclerView;

public class ScrollHelper {
    /* package */ static void smoothScrollToPosition(RecyclerView recyclerView, ViewPagerLayoutManager viewPagerLayoutManager, int targetPosition) {
        final int delta = viewPagerLayoutManager.getOffsetToPosition(targetPosition);
        if (viewPagerLayoutManager.getOrientation() == RecyclerView.VERTICAL) {
            recyclerView.smoothScrollBy(0, delta);
        } else {
            recyclerView.smoothScrollBy(delta, 0);
        }
    }

}
