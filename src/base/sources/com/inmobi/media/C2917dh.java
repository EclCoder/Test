package com.inmobi.media;

import android.view.View;
import android.widget.ImageView;
import com.inmobi.media.C2917dh;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.dh, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2917dh {
    public static void a(C2865bh publisherNativeViewData, final Function1 onClick) {
        kotlin.jvm.internal.s.h(publisherNativeViewData, "publisherNativeViewData");
        kotlin.jvm.internal.s.h(onClick, "onClick");
        publisherNativeViewData.f26265a.getParentView().setOnClickListener(new View.OnClickListener() { // from class: yh.z7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2917dh.a(onClick, view);
            }
        });
        View titleView = publisherNativeViewData.f26265a.getTitleView();
        if (titleView != null) {
            titleView.setOnClickListener(new View.OnClickListener() { // from class: yh.a8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.b(onClick, view);
                }
            });
        }
        View descriptionView = publisherNativeViewData.f26265a.getDescriptionView();
        if (descriptionView != null) {
            descriptionView.setOnClickListener(new View.OnClickListener() { // from class: yh.b8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.c(onClick, view);
                }
            });
        }
        ImageView iconView = publisherNativeViewData.f26265a.getIconView();
        if (iconView != null) {
            iconView.setOnClickListener(new View.OnClickListener() { // from class: yh.c8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.d(onClick, view);
                }
            });
        }
        View ctaView = publisherNativeViewData.f26265a.getCtaView();
        if (ctaView != null) {
            ctaView.setOnClickListener(new View.OnClickListener() { // from class: yh.d8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.e(onClick, view);
                }
            });
        }
        View advertiserView = publisherNativeViewData.f26265a.getAdvertiserView();
        if (advertiserView != null) {
            advertiserView.setOnClickListener(new View.OnClickListener() { // from class: yh.e8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.f(onClick, view);
                }
            });
        }
        View ratingView = publisherNativeViewData.f26265a.getRatingView();
        if (ratingView != null) {
            ratingView.setOnClickListener(new View.OnClickListener() { // from class: yh.f8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2917dh.g(onClick, view);
                }
            });
        }
        View view = publisherNativeViewData.f26267c;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: yh.g8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C2917dh.h(onClick, view2);
                }
            });
        }
    }

    public static final void b(Function1 function1, View view) {
        function1.invoke((short) 3);
    }

    public static final void c(Function1 function1, View view) {
        function1.invoke((short) 4);
    }

    public static final void d(Function1 function1, View view) {
        function1.invoke((short) 5);
    }

    public static final void e(Function1 function1, View view) {
        function1.invoke((short) 6);
    }

    public static final void f(Function1 function1, View view) {
        function1.invoke((short) 9);
    }

    public static final void g(Function1 function1, View view) {
        function1.invoke((short) 8);
    }

    public static final void h(Function1 function1, View view) {
        function1.invoke((short) 7);
    }

    public static final void a(Function1 function1, View view) {
        function1.invoke((short) 2);
    }
}
