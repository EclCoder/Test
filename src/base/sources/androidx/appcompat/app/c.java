package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends q implements DialogInterface {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final AlertController f713g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.b f714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f715b;

        public a(Context context) {
            this(context, c.u(context, 0));
        }

        public a a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f680w = listAdapter;
            bVar.f681x = onClickListener;
            return this;
        }

        public a b(View view) {
            this.f714a.f664g = view;
            return this;
        }

        public a c(int i10) {
            this.f714a.f660c = i10;
            return this;
        }

        public c create() {
            c cVar = new c(this.f714a.f658a, this.f715b);
            this.f714a.a(cVar.f713g);
            cVar.setCancelable(this.f714a.f675r);
            if (this.f714a.f675r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f714a.f676s);
            cVar.setOnDismissListener(this.f714a.f677t);
            DialogInterface.OnKeyListener onKeyListener = this.f714a.f678u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public a d(Drawable drawable) {
            this.f714a.f661d = drawable;
            return this;
        }

        public a e(int i10) {
            AlertController.b bVar = this.f714a;
            bVar.f665h = bVar.f658a.getText(i10);
            return this;
        }

        public a f(CharSequence charSequence) {
            this.f714a.f665h = charSequence;
            return this;
        }

        public a g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f679v = charSequenceArr;
            bVar.J = onMultiChoiceClickListener;
            bVar.F = zArr;
            bVar.G = true;
            return this;
        }

        public Context getContext() {
            return this.f714a.f658a;
        }

        public a h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f669l = charSequence;
            bVar.f671n = onClickListener;
            return this;
        }

        public a i(DialogInterface.OnKeyListener onKeyListener) {
            this.f714a.f678u = onKeyListener;
            return this;
        }

        public a j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f666i = charSequence;
            bVar.f668k = onClickListener;
            return this;
        }

        public a k(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f680w = listAdapter;
            bVar.f681x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f679v = charSequenceArr;
            bVar.f681x = onClickListener;
            bVar.I = i10;
            bVar.H = true;
            return this;
        }

        public a m(int i10) {
            AlertController.b bVar = this.f714a;
            bVar.f663f = bVar.f658a.getText(i10);
            return this;
        }

        public c n() {
            c cVarCreate = create();
            cVarCreate.show();
            return cVarCreate;
        }

        public a setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f669l = bVar.f658a.getText(i10);
            this.f714a.f671n = onClickListener;
            return this;
        }

        public a setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.b bVar = this.f714a;
            bVar.f666i = bVar.f658a.getText(i10);
            this.f714a.f668k = onClickListener;
            return this;
        }

        public a setTitle(CharSequence charSequence) {
            this.f714a.f663f = charSequence;
            return this;
        }

        public a setView(View view) {
            AlertController.b bVar = this.f714a;
            bVar.f683z = view;
            bVar.f682y = 0;
            bVar.E = false;
            return this;
        }

        public a(Context context, int i10) {
            this.f714a = new AlertController.b(new ContextThemeWrapper(context, c.u(context, i10)));
            this.f715b = i10;
        }
    }

    protected c(Context context) {
        this(context, 0);
    }

    static int u(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f39859l, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.appcompat.app.q, androidx.activity.w, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f713g.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f713g.g(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f713g.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    public Button s(int i10) {
        return this.f713g.c(i10);
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f713g.q(charSequence);
    }

    public ListView t() {
        return this.f713g.e();
    }

    public void v(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.f713g.k(i10, charSequence, onClickListener, null, null);
    }

    public void w(View view) {
        this.f713g.s(view);
    }

    protected c(Context context, int i10) {
        super(context, u(context, i10));
        this.f713g = new AlertController(getContext(), this, getWindow());
    }
}
