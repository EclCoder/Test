package com.bytedance.sdk.openadsdk.qor;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.utils.sq;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends ScrollView {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.dkl.sk f14588hn;
    private final ta hnj;

    public dkl(Context context, ta taVar) {
        super(context);
        this.hnj = taVar;
        com.bytedance.sdk.openadsdk.core.dkl.sk skVar = new com.bytedance.sdk.openadsdk.core.dkl.sk(context);
        this.f14588hn = skVar;
        skVar.setOrientation(1);
        addView(skVar, new FrameLayout.LayoutParams(-1, -2));
        if (taVar.aq() == 0) {
            hnj();
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setVerticalScrollBarEnabled(false);
    }

    private void hn(List<FilterWord> list) {
        this.f14588hn.removeAllViews();
        for (int i10 = 0; i10 < list.size(); i10++) {
            FilterWord filterWord = list.get(i10);
            if (filterWord != null) {
                this.f14588hn.addView(new dse(getContext(), filterWord, this.hnj));
            }
            if (i10 < list.size() - 1) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int iHn = sq.hn(getContext(), this.hnj.ojm() ? 16.0f : 8.0f);
                layoutParams.topMargin = iHn;
                layoutParams.bottomMargin = iHn;
                this.f14588hn.addView(new dnm(getContext()), layoutParams);
            }
        }
    }

    private void hnj() {
        if (this.hnj.aq() != 0) {
            return;
        }
        this.hnj.hnj(sq.qor(getContext()), sq.sk(getContext()));
    }

    private static List<FilterWord> qor(List<FilterWord> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i10 = 0;
        int i11 = -1;
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (list.get(i12).hasSecondOptions()) {
                i11 = i12;
            }
        }
        if (i11 != -1 && i11 <= list.size()) {
            i10 = i11;
        }
        FilterWord filterWord = list.get(i10);
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            FilterWord next = it.next();
            if (!next.hasSecondOptions()) {
                filterWord.addOption(next);
                it.remove();
            }
        }
        return list;
    }

    public void hnj(List<FilterWord> list) {
        List<FilterWord> listQor = qor(list);
        if (listQor == null) {
            return;
        }
        hn(listQor);
    }
}
