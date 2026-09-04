package bc;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;
import androidx.appcompat.view.d;
import mc.i;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class b extends androidx.appcompat.app.c.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f8821e = h.a.f39858k;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f8822f = l.f51855a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f8823g = sb.c.f51646z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f8824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f8825d;

    public b(Context context, int i10) {
        super(o(context), q(context, i10));
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int i11 = f8821e;
        int i12 = f8822f;
        this.f8825d = c.a(context2, i11, i12);
        int iC = ac.a.c(context2, sb.c.f51620m, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, m.G4, i11, i12);
        int color = typedArrayObtainStyledAttributes.getColor(m.L4, iC);
        typedArrayObtainStyledAttributes.recycle();
        i iVar = new i(context2, null, i11, i12);
        iVar.Y(context2);
        iVar.l0(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                iVar.h0(dimension);
            }
        }
        this.f8824c = iVar;
    }

    private static Context o(Context context) {
        int iP = p(context);
        Context contextD = pc.a.d(context, null, f8821e, f8822f);
        return iP == 0 ? contextD : new d(contextD, iP);
    }

    private static int p(Context context) {
        TypedValue typedValueA = jc.b.a(context, f8823g);
        if (typedValueA == null) {
            return 0;
        }
        return typedValueA.data;
    }

    private static int q(Context context, int i10) {
        return i10 == 0 ? p(context) : i10;
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public b i(DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.i(onKeyListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b setPositiveButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setPositiveButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public b j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.j(charSequence, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b k(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(listAdapter, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b l(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequenceArr, i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public b m(int i10) {
        return (b) super.m(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b setTitle(CharSequence charSequence) {
        return (b) super.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public b setView(View view) {
        return (b) super.setView(view);
    }

    @Override // androidx.appcompat.app.c.a
    public androidx.appcompat.app.c create() {
        androidx.appcompat.app.c cVarCreate = super.create();
        Window window = cVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f8824c;
        if (drawable instanceof i) {
            ((i) drawable).k0(decorView.getElevation());
        }
        window.setBackgroundDrawable(c.b(this.f8824c, this.f8825d));
        decorView.setOnTouchListener(new a(cVarCreate, this.f8825d));
        return cVarCreate;
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public b a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        return (b) super.a(listAdapter, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public b b(View view) {
        return (b) super.b(view);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b c(int i10) {
        return (b) super.c(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public b d(Drawable drawable) {
        return (b) super.d(drawable);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public b e(int i10) {
        return (b) super.e(i10);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public b f(CharSequence charSequence) {
        return (b) super.f(charSequence);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public b g(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.g(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public b setNegativeButton(int i10, DialogInterface.OnClickListener onClickListener) {
        return (b) super.setNegativeButton(i10, onClickListener);
    }

    @Override // androidx.appcompat.app.c.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public b h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        return (b) super.h(charSequence, onClickListener);
    }
}
