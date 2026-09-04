package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class jbd {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface hn {
        void hn();

        void hnj();

        void hnj(View view, boolean z10);

        void hnj(boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class hnj implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        final /* synthetic */ ViewGroup f14651hn;
        View hnj = null;
        final /* synthetic */ boolean qor;

        hnj(ViewGroup viewGroup, boolean z10) {
            this.f14651hn = viewGroup;
            this.qor = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                hn hnVar = (hn) this.f14651hn.getTag(520093765);
                if (this.hnj == null) {
                    ViewGroup viewGroup = this.f14651hn;
                    jbd.hn(viewGroup, hnVar, (Integer) viewGroup.getTag(520093766), this.qor);
                    return;
                }
                Rect rect = new Rect();
                this.hnj.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f14651hn.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (hnVar != null) {
                        hnVar.hnj(this.f14651hn, false);
                    }
                    this.f14651hn.setTag(520093763, Boolean.FALSE);
                } else {
                    if (hnVar != null) {
                        hnVar.hnj(this.f14651hn, true);
                    }
                    this.f14651hn.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f14651hn.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(View view, hn hnVar, Integer num, boolean z10) {
        if (hnVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        hnVar.hnj(view, hnj(view, num.intValue(), z10));
    }

    public static void hnj(final ViewGroup viewGroup, boolean z10, int i10, final boolean z11, hn hnVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, hnVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final hnj hnjVar = new hnj(viewGroup, z11);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.jbd.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        hnjVar.hnj = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        hnjVar.hnj = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(hnjVar);
        if (z10) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.jbd.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        hn hnVar2 = (hn) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        jbd.hn(viewGroup2, hnVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.jbd.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z12) {
                try {
                    hn hnVar2 = (hn) viewGroup.getTag(520093765);
                    if (hnVar2 != null) {
                        hnVar2.hnj(z12);
                        ViewGroup viewGroup2 = viewGroup;
                        jbd.hn(viewGroup2, hnVar2, (Integer) viewGroup2.getTag(520093766), z11);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.jbd.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                hn hnVar2 = (hn) viewGroup.getTag(520093765);
                if (hnVar2 != null) {
                    hnVar2.hnj();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                hn hnVar2 = (hn) viewGroup.getTag(520093765);
                if (hnVar2 != null) {
                    hnVar2.hn();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean hnj(View view, int i10, boolean z10) {
        return com.bytedance.sdk.openadsdk.core.fvt.hnj(view, 20, i10, z10);
    }

    public static ArrayList<View> hnj(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(hnj((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View hnj(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return hnj((View) parent, cls);
    }
}
