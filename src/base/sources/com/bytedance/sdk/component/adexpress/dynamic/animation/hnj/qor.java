package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static volatile qor hnj;

    private qor() {
    }

    public static qor hnj() {
        if (hnj == null) {
            synchronized (qor.class) {
                try {
                    if (hnj == null) {
                        hnj = new qor();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public gjv hnj(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        if (hnjVar == null) {
            return null;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).setClipChildren(false);
        }
        if (view.getParent().getParent() != null) {
            ((ViewGroup) view.getParent().getParent()).setClipChildren(false);
        }
        if ("scale".equals(hnjVar.ojm())) {
            return new dnm(view, hnjVar);
        }
        if ("translate".equals(hnjVar.ojm())) {
            return new fc(view, hnjVar);
        }
        if ("ripple".equals(hnjVar.ojm())) {
            return new aq(view, hnjVar);
        }
        if ("marquee".equals(hnjVar.ojm())) {
            return new dse(view, hnjVar);
        }
        if ("waggle".equals(hnjVar.ojm())) {
            return new jip(view, hnjVar);
        }
        if ("shine".equals(hnjVar.ojm())) {
            return new bug(view, hnjVar);
        }
        if ("swing".equals(hnjVar.ojm())) {
            return new mjg(view, hnjVar);
        }
        if ("fade".equals(hnjVar.ojm())) {
            return new hnj(view, hnjVar);
        }
        if ("rubIn".equals(hnjVar.ojm())) {
            return new ta(view, hnjVar);
        }
        if ("rotate".equals(hnjVar.ojm())) {
            return new ojm(view, hnjVar);
        }
        if ("cutIn".equals(hnjVar.ojm())) {
            return new dkl(view, hnjVar);
        }
        if ("stretch".equals(hnjVar.ojm())) {
            return new orl(view, hnjVar);
        }
        if ("bounce".equals(hnjVar.ojm())) {
            return new sk(view, hnjVar);
        }
        return null;
    }
}
