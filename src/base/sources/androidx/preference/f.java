package androidx.preference;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends androidx.fragment.app.m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private DialogPreference f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CharSequence f6361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f6362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f6363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f6364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f6365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BitmapDrawable f6366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6367h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {
        static void a(Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    private void z(Dialog dialog) {
        Window window = dialog.getWindow();
        if (Build.VERSION.SDK_INT >= 30) {
            a.a(window);
        } else {
            A();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.f6367h = i10;
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n4.j targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.f6361b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f6362c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f6363d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f6364e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f6365f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f6366g = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) aVar.j(string);
        this.f6360a = dialogPreference;
        this.f6361b = dialogPreference.R0();
        this.f6362c = this.f6360a.T0();
        this.f6363d = this.f6360a.S0();
        this.f6364e = this.f6360a.Q0();
        this.f6365f = this.f6360a.P0();
        Drawable drawableO0 = this.f6360a.O0();
        if (drawableO0 == null || (drawableO0 instanceof BitmapDrawable)) {
            this.f6366g = (BitmapDrawable) drawableO0;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableO0.getIntrinsicWidth(), drawableO0.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawableO0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawableO0.draw(canvas);
        this.f6366g = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.m
    public Dialog onCreateDialog(Bundle bundle) {
        this.f6367h = -2;
        androidx.appcompat.app.c.a aVarH = new androidx.appcompat.app.c.a(requireContext()).setTitle(this.f6361b).d(this.f6366g).j(this.f6362c, this).h(this.f6363d, this);
        View viewW = w(requireContext());
        if (viewW != null) {
            v(viewW);
            aVarH.setView(viewW);
        } else {
            aVarH.f(this.f6364e);
        }
        y(aVarH);
        androidx.appcompat.app.c cVarCreate = aVarH.create();
        if (u()) {
            z(cVarCreate);
        }
        return cVarCreate;
    }

    @Override // androidx.fragment.app.m, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        x(this.f6367h == -1);
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f6361b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f6362c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f6363d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f6364e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f6365f);
        BitmapDrawable bitmapDrawable = this.f6366g;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public DialogPreference t() {
        if (this.f6360a == null) {
            this.f6360a = (DialogPreference) ((DialogPreference.a) getTargetFragment()).j(requireArguments().getString("key"));
        }
        return this.f6360a;
    }

    protected boolean u() {
        return false;
    }

    protected void v(View view) {
        int i10;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f6364e;
            if (TextUtils.isEmpty(charSequence)) {
                i10 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i10 = 0;
            }
            if (viewFindViewById.getVisibility() != i10) {
                viewFindViewById.setVisibility(i10);
            }
        }
    }

    protected View w(Context context) {
        int i10 = this.f6365f;
        if (i10 == 0) {
            return null;
        }
        return getLayoutInflater().inflate(i10, (ViewGroup) null);
    }

    public abstract void x(boolean z10);

    protected void A() {
    }

    protected void y(androidx.appcompat.app.c.a aVar) {
    }
}
