package com.facebook.share.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.internal.e;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class ShareButton extends b {
    public ShareButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, "fb_share_button_create", "fb_share_button_did_tap");
    }

    @Override // com.facebook.share.widget.b, com.facebook.t
    protected void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setCompoundDrawablesWithIntrinsicBounds(i.a.b(getContext(), com.facebook.common.b.f15040a), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    @Override // com.facebook.t
    protected int getDefaultRequestCode() {
        return e.c.Share.g();
    }

    @Override // com.facebook.t
    protected int getDefaultStyleResource() {
        return com.facebook.share.a.f16013b;
    }

    @Override // com.facebook.share.widget.b
    protected c getDialog() {
        c cVar;
        if (getFragment() != null) {
            cVar = new c(getFragment(), getRequestCode());
        } else {
            cVar = getNativeFragment() != null ? new c(getNativeFragment(), getRequestCode()) : new c(getActivity(), getRequestCode());
        }
        cVar.i(getCallbackManager());
        return cVar;
    }
}
