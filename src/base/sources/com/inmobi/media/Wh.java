package com.inmobi.media;

import android.R;
import android.app.Activity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.widget.AbsoluteLayout;
import android.widget.FrameLayout;
import com.inmobi.media.Wh;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wh extends Th {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f25954b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wh(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi) {
        super(gestureDetectorOnGestureListenerC3228pi);
        this.f25954b = gestureDetectorOnGestureListenerC3228pi;
    }

    public static final boolean a(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        a();
        super.onHideCustomView();
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(callback, "callback");
        if (this.f25954b.f27257u.get() != null) {
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f25954b;
            gestureDetectorOnGestureListenerC3228pi.S = view;
            gestureDetectorOnGestureListenerC3228pi.T = callback;
            if (view != null) {
                view.setOnTouchListener(new View.OnTouchListener() { // from class: yh.p5
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                        return Wh.a(view2, motionEvent);
                    }
                });
            }
            Activity activity = (Activity) this.f25954b.f27257u.get();
            FrameLayout frameLayout = activity != null ? (FrameLayout) activity.findViewById(R.id.content) : null;
            View view2 = this.f25954b.S;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f25954b.S, new AbsoluteLayout.LayoutParams(-1, -1, 0, 0));
            }
            View view3 = this.f25954b.S;
            if (view3 != null) {
                view3.requestFocus();
            }
            final GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f25954b;
            View view4 = gestureDetectorOnGestureListenerC3228pi2.S;
            View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: yh.q5
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view5, int i10, KeyEvent keyEvent) {
                    return Wh.a(gestureDetectorOnGestureListenerC3228pi2, this, view5, i10, keyEvent);
                }
            };
            if (view4 != null) {
                view4.setOnKeyListener(onKeyListener);
            }
            if (view4 != null) {
                view4.setFocusable(true);
            }
            if (view4 != null) {
                view4.setFocusableInTouchMode(true);
            }
            if (view4 != null) {
                view4.requestFocus();
            }
        }
    }

    public final void a() {
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f25954b;
        if (gestureDetectorOnGestureListenerC3228pi.S == null) {
            return;
        }
        WebChromeClient.CustomViewCallback customViewCallback = gestureDetectorOnGestureListenerC3228pi.T;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f25954b;
        gestureDetectorOnGestureListenerC3228pi2.T = null;
        View view = gestureDetectorOnGestureListenerC3228pi2.S;
        if ((view != null ? view.getParent() : null) != null) {
            View view2 = this.f25954b.S;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(this.f25954b.S);
            }
            this.f25954b.S = null;
        }
    }

    public static final boolean a(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, Wh wh2, View view, int i10, KeyEvent keyEvent) {
        if (4 != keyEvent.getKeyCode() || keyEvent.getAction() != 0) {
            return false;
        }
        InterfaceC3322t9 interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
        if (interfaceC3322t9 != null) {
            String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
            kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
            ((C3348u9) interfaceC3322t9).a(str, "Back pressed when HTML5 video is playing.");
        }
        wh2.a();
        return true;
    }
}
