package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q extends androidx.activity.w implements e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n0.n.a f814f;

    public q(Context context, int i10) {
        super(context, o(context, i10));
        this.f814f = new n0.n.a() { // from class: androidx.appcompat.app.p
            @Override // n0.n.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.f812a.p(keyEvent);
            }
        };
        h hVarM = m();
        hVarM.S(o(context, i10));
        hVarM.C(null);
    }

    private static int o(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f39872y, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.w, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        m().f(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m().D();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return n0.n.e(this.f814f, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return m().n(i10);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m().z();
    }

    public h m() {
        if (this.f813e == null) {
            this.f813e = h.m(this, this);
        }
        return this.f813e;
    }

    @Override // androidx.activity.w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        m().y();
        super.onCreate(bundle);
        m().C(bundle);
    }

    @Override // androidx.activity.w, android.app.Dialog
    protected void onStop() {
        super.onStop();
        m().I();
    }

    boolean p(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b q(androidx.appcompat.view.b.a aVar) {
        return null;
    }

    public boolean r(int i10) {
        return m().L(i10);
    }

    @Override // androidx.activity.w, android.app.Dialog
    public void setContentView(int i10) {
        h();
        m().N(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m().T(charSequence);
    }

    @Override // androidx.activity.w, android.app.Dialog
    public void setContentView(View view) {
        h();
        m().O(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        m().T(getContext().getString(i10));
    }

    @Override // androidx.activity.w, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        h();
        m().P(view, layoutParams);
    }

    @Override // androidx.appcompat.app.e
    public void l(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.e
    public void n(androidx.appcompat.view.b bVar) {
    }
}
