package com.bytedance.adsdk.ugeno.sk;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
interface hnj {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<qor> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int hn(int i10, int i11, int i12);

    View hn(int i10);

    int hnj(int i10, int i11, int i12);

    int hnj(View view);

    int hnj(View view, int i10, int i11);

    View hnj(int i10);

    void hnj(View view, int i10, int i11, qor qorVar);

    void hnj(qor qorVar);

    boolean hnj();

    void setFlexLines(List<qor> list);
}
