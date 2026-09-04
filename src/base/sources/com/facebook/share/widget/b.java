package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.h0;
import com.facebook.r;
import com.facebook.t;
import e8.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f16022j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f16023k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f16024l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private r f16025m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (x7.a.c(this)) {
                return;
            }
            try {
                b.this.b(view);
                b.this.getDialog().j(b.this.getShareContent());
            } catch (Throwable th2) {
                x7.a.b(th2, this);
            }
        }
    }

    protected b(Context context, AttributeSet attributeSet, int i10, String str, String str2) {
        super(context, attributeSet, i10, 0, str, str2);
        this.f16023k = 0;
        this.f16024l = false;
        this.f16023k = isInEditMode() ? 0 : getDefaultRequestCode();
        o(false);
    }

    private void o(boolean z10) {
        setEnabled(z10);
        this.f16024l = false;
    }

    @Override // com.facebook.t
    protected void c(Context context, AttributeSet attributeSet, int i10, int i11) {
        super.c(context, attributeSet, i10, i11);
        setInternalOnClickListener(getShareOnClickListener());
    }

    protected r getCallbackManager() {
        return this.f16025m;
    }

    protected abstract c getDialog();

    @Override // com.facebook.t
    public int getRequestCode() {
        return this.f16023k;
    }

    public d getShareContent() {
        return this.f16022j;
    }

    protected View.OnClickListener getShareOnClickListener() {
        return new a();
    }

    protected boolean n() {
        return getDialog().b(getShareContent());
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f16024l = true;
    }

    protected void setRequestCode(int i10) {
        if (!h0.I(i10)) {
            this.f16023k = i10;
            return;
        }
        throw new IllegalArgumentException("Request code " + i10 + " cannot be within the range reserved by the Facebook SDK.");
    }

    public void setShareContent(d dVar) {
        this.f16022j = dVar;
        if (this.f16024l) {
            return;
        }
        o(n());
    }
}
