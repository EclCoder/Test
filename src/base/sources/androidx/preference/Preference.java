package androidx.preference;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private int H;
    private c I;
    private List J;
    private PreferenceGroup K;
    private boolean L;
    private boolean M;
    private f N;
    private g O;
    private final View.OnClickListener P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f6306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f6307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f6309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f6310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f6311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f6312g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6313h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f6314i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f6315j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f6316k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f6317l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f6318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Intent f6319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f6320o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Bundle f6321p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f6322q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f6323r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f6324s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f6325t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f6326u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f6327v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f6328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f6329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f6330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f6331z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.f0(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface c {
        void b(Preference preference);

        void c(Preference preference);

        void d(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        boolean k(Preference preference, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        boolean l(Preference preference);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class f implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Preference f6333a;

        f(Preference preference) {
            this.f6333a = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence charSequenceC = this.f6333a.C();
            if (!this.f6333a.H() || TextUtils.isEmpty(charSequenceC)) {
                return;
            }
            contextMenu.setHeaderTitle(charSequenceC);
            contextMenu.add(0, 0, 0, q.f6447a).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f6333a.j().getSystemService("clipboard");
            CharSequence charSequenceC = this.f6333a.C();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", charSequenceC));
            Toast.makeText(this.f6333a.j(), this.f6333a.j().getString(q.f6450d, charSequenceC), 0).show();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface g {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f6312g = Integer.MAX_VALUE;
        this.f6313h = 0;
        this.f6322q = true;
        this.f6323r = true;
        this.f6325t = true;
        this.f6328w = true;
        this.f6329x = true;
        this.f6330y = true;
        this.f6331z = true;
        this.A = true;
        this.C = true;
        this.F = true;
        int i12 = p.f6444b;
        this.G = i12;
        this.P = new a();
        this.f6306a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.J, i10, i11);
        this.f6316k = d0.k.l(typedArrayObtainStyledAttributes, s.f6475h0, s.K, 0);
        this.f6318m = d0.k.m(typedArrayObtainStyledAttributes, s.f6484k0, s.Q);
        this.f6314i = d0.k.n(typedArrayObtainStyledAttributes, s.f6500s0, s.O);
        this.f6315j = d0.k.n(typedArrayObtainStyledAttributes, s.f6498r0, s.R);
        this.f6312g = d0.k.d(typedArrayObtainStyledAttributes, s.f6488m0, s.S, Integer.MAX_VALUE);
        this.f6320o = d0.k.m(typedArrayObtainStyledAttributes, s.f6472g0, s.X);
        this.G = d0.k.l(typedArrayObtainStyledAttributes, s.f6486l0, s.N, i12);
        this.H = d0.k.l(typedArrayObtainStyledAttributes, s.f6502t0, s.T, 0);
        this.f6322q = d0.k.b(typedArrayObtainStyledAttributes, s.f6469f0, s.M, true);
        this.f6323r = d0.k.b(typedArrayObtainStyledAttributes, s.f6492o0, s.P, true);
        this.f6325t = d0.k.b(typedArrayObtainStyledAttributes, s.f6490n0, s.L, true);
        this.f6326u = d0.k.m(typedArrayObtainStyledAttributes, s.f6463d0, s.U);
        int i13 = s.f6454a0;
        this.f6331z = d0.k.b(typedArrayObtainStyledAttributes, i13, i13, this.f6323r);
        int i14 = s.f6457b0;
        this.A = d0.k.b(typedArrayObtainStyledAttributes, i14, i14, this.f6323r);
        int i15 = s.f6460c0;
        if (typedArrayObtainStyledAttributes.hasValue(i15)) {
            this.f6327v = W(typedArrayObtainStyledAttributes, i15);
        } else {
            int i16 = s.V;
            if (typedArrayObtainStyledAttributes.hasValue(i16)) {
                this.f6327v = W(typedArrayObtainStyledAttributes, i16);
            }
        }
        this.F = d0.k.b(typedArrayObtainStyledAttributes, s.f6494p0, s.W, true);
        int i17 = s.f6496q0;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i17);
        this.B = zHasValue;
        if (zHasValue) {
            this.C = d0.k.b(typedArrayObtainStyledAttributes, i17, s.Y, true);
        }
        this.D = d0.k.b(typedArrayObtainStyledAttributes, s.f6478i0, s.Z, false);
        int i18 = s.f6481j0;
        this.f6330y = d0.k.b(typedArrayObtainStyledAttributes, i18, i18, true);
        int i19 = s.f6466e0;
        this.E = d0.k.b(typedArrayObtainStyledAttributes, i19, i19, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void L0(SharedPreferences.Editor editor) {
        if (this.f6307b.t()) {
            editor.apply();
        }
    }

    private void M0() {
        Preference preferenceI;
        String str = this.f6326u;
        if (str == null || (preferenceI = i(str)) == null) {
            return;
        }
        preferenceI.N0(this);
    }

    private void N0(Preference preference) {
        List list = this.J;
        if (list != null) {
            list.remove(preference);
        }
    }

    private void h() {
        z();
        if (K0() && B().contains(this.f6318m)) {
            d0(true, null);
            return;
        }
        Object obj = this.f6327v;
        if (obj != null) {
            d0(false, obj);
        }
    }

    private void l0() {
        if (TextUtils.isEmpty(this.f6326u)) {
            return;
        }
        Preference preferenceI = i(this.f6326u);
        if (preferenceI != null) {
            preferenceI.m0(this);
            return;
        }
        throw new IllegalStateException("Dependency \"" + this.f6326u + "\" not found for preference \"" + this.f6318m + "\" (title: \"" + ((Object) this.f6314i) + "\"");
    }

    private void m0(Preference preference) {
        if (this.J == null) {
            this.J = new ArrayList();
        }
        this.J.add(preference);
        preference.U(this, J0());
    }

    private void s0(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                s0(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public j A() {
        return this.f6307b;
    }

    public void A0(e eVar) {
        this.f6311f = eVar;
    }

    public SharedPreferences B() {
        if (this.f6307b == null) {
            return null;
        }
        z();
        return this.f6307b.l();
    }

    public void B0(int i10) {
        if (i10 != this.f6312g) {
            this.f6312g = i10;
            O();
        }
    }

    public CharSequence C() {
        return D() != null ? D().a(this) : this.f6315j;
    }

    public void C0(boolean z10) {
        if (this.f6323r != z10) {
            this.f6323r = z10;
            M();
        }
    }

    public final g D() {
        return this.O;
    }

    public void D0(CharSequence charSequence) {
        if (D() != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.f6315j, charSequence)) {
            return;
        }
        this.f6315j = charSequence;
        M();
    }

    public CharSequence E() {
        return this.f6314i;
    }

    public final void E0(g gVar) {
        this.O = gVar;
        M();
    }

    public final int F() {
        return this.H;
    }

    public void F0(int i10) {
        G0(this.f6306a.getString(i10));
    }

    public boolean G() {
        return !TextUtils.isEmpty(this.f6318m);
    }

    public void G0(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f6314i)) {
            return;
        }
        this.f6314i = charSequence;
        M();
    }

    public boolean H() {
        return this.E;
    }

    public final void H0(boolean z10) {
        if (this.f6330y != z10) {
            this.f6330y = z10;
            c cVar = this.I;
            if (cVar != null) {
                cVar.b(this);
            }
        }
    }

    public boolean I() {
        return this.f6322q && this.f6328w && this.f6329x;
    }

    public void I0(int i10) {
        this.H = i10;
    }

    public boolean J() {
        return this.f6325t;
    }

    public boolean J0() {
        return !I();
    }

    public boolean K() {
        return this.f6323r;
    }

    protected boolean K0() {
        return this.f6307b != null && J() && G();
    }

    public final boolean L() {
        return this.f6330y;
    }

    protected void M() {
        c cVar = this.I;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    public void N(boolean z10) {
        List list = this.J;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((Preference) list.get(i10)).U(this, z10);
        }
    }

    protected void O() {
        c cVar = this.I;
        if (cVar != null) {
            cVar.d(this);
        }
    }

    public void P() {
        l0();
    }

    protected void Q(j jVar) {
        this.f6307b = jVar;
        if (!this.f6309d) {
            this.f6308c = jVar.f();
        }
        h();
    }

    protected void R(j jVar, long j10) {
        this.f6308c = j10;
        this.f6309d = true;
        try {
            Q(jVar);
        } finally {
            this.f6309d = false;
        }
    }

    public void S(l lVar) {
        Integer numValueOf;
        View view = lVar.itemView;
        view.setOnClickListener(this.P);
        view.setId(this.f6313h);
        TextView textView = (TextView) lVar.b(R.id.summary);
        if (textView != null) {
            CharSequence charSequenceC = C();
            if (TextUtils.isEmpty(charSequenceC)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceC);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) lVar.b(R.id.title);
        if (textView2 != null) {
            CharSequence charSequenceE = E();
            if (TextUtils.isEmpty(charSequenceE)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequenceE);
                textView2.setVisibility(0);
                if (this.B) {
                    textView2.setSingleLine(this.C);
                }
                if (!K() && I() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) lVar.b(R.id.icon);
        if (imageView != null) {
            int i10 = this.f6316k;
            if (i10 != 0 || this.f6317l != null) {
                if (this.f6317l == null) {
                    this.f6317l = i.a.b(this.f6306a, i10);
                }
                Drawable drawable = this.f6317l;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.f6317l != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.D ? 4 : 8);
            }
        }
        View viewB = lVar.b(o.f6437a);
        if (viewB == null) {
            viewB = lVar.b(R.id.icon_frame);
        }
        if (viewB != null) {
            if (this.f6317l != null) {
                viewB.setVisibility(0);
            } else {
                viewB.setVisibility(this.D ? 4 : 8);
            }
        }
        if (this.F) {
            s0(view, I());
        } else {
            s0(view, true);
        }
        boolean zK = K();
        view.setFocusable(zK);
        view.setClickable(zK);
        lVar.f(this.f6331z);
        lVar.g(this.A);
        boolean zH = H();
        if (zH && this.N == null) {
            this.N = new f(this);
        }
        view.setOnCreateContextMenuListener(zH ? this.N : null);
        view.setLongClickable(zH);
        if (!zH || zK) {
            return;
        }
        q0.p0(view, null);
    }

    public void U(Preference preference, boolean z10) {
        if (this.f6328w == z10) {
            this.f6328w = !z10;
            N(J0());
            M();
        }
    }

    public void V() {
        M0();
        this.L = true;
    }

    protected Object W(TypedArray typedArray, int i10) {
        return null;
    }

    public void Y(Preference preference, boolean z10) {
        if (this.f6329x == z10) {
            this.f6329x = !z10;
            N(J0());
            M();
        }
    }

    protected void Z() {
        M0();
    }

    protected void a0(Parcelable parcelable) {
        this.M = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    void b(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.K != null) {
            throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        }
        this.K = preferenceGroup;
    }

    protected Parcelable b0() {
        this.M = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public boolean c(Object obj) {
        d dVar = this.f6310e;
        return dVar == null || dVar.k(this, obj);
    }

    final void d() {
        this.L = false;
    }

    protected void d0(boolean z10, Object obj) {
        c0(obj);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i10 = this.f6312g;
        int i11 = preference.f6312g;
        if (i10 != i11) {
            return i10 - i11;
        }
        CharSequence charSequence = this.f6314i;
        CharSequence charSequence2 = preference.f6314i;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f6314i.toString());
    }

    public void e0() {
        j.c cVarH;
        if (I() && K()) {
            T();
            e eVar = this.f6311f;
            if (eVar == null || !eVar.l(this)) {
                j jVarA = A();
                if ((jVarA == null || (cVarH = jVarA.h()) == null || !cVarH.n(this)) && this.f6319n != null) {
                    j().startActivity(this.f6319n);
                }
            }
        }
    }

    void f(Bundle bundle) {
        Parcelable parcelable;
        if (!G() || (parcelable = bundle.getParcelable(this.f6318m)) == null) {
            return;
        }
        this.M = false;
        a0(parcelable);
        if (!this.M) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    protected void f0(View view) {
        e0();
    }

    void g(Bundle bundle) {
        if (G()) {
            this.M = false;
            Parcelable parcelableB0 = b0();
            if (!this.M) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableB0 != null) {
                bundle.putParcelable(this.f6318m, parcelableB0);
            }
        }
    }

    protected boolean g0(boolean z10) {
        if (!K0()) {
            return false;
        }
        if (z10 == u(!z10)) {
            return true;
        }
        z();
        SharedPreferences.Editor editorE = this.f6307b.e();
        editorE.putBoolean(this.f6318m, z10);
        L0(editorE);
        return true;
    }

    protected boolean h0(float f10) {
        if (!K0()) {
            return false;
        }
        if (f10 == v(Float.NaN)) {
            return true;
        }
        z();
        SharedPreferences.Editor editorE = this.f6307b.e();
        editorE.putFloat(this.f6318m, f10);
        L0(editorE);
        return true;
    }

    protected Preference i(String str) {
        j jVar = this.f6307b;
        if (jVar == null) {
            return null;
        }
        return jVar.a(str);
    }

    protected boolean i0(int i10) {
        if (!K0()) {
            return false;
        }
        if (i10 == w(~i10)) {
            return true;
        }
        z();
        SharedPreferences.Editor editorE = this.f6307b.e();
        editorE.putInt(this.f6318m, i10);
        L0(editorE);
        return true;
    }

    public Context j() {
        return this.f6306a;
    }

    protected boolean j0(String str) {
        if (!K0()) {
            return false;
        }
        if (TextUtils.equals(str, x(null))) {
            return true;
        }
        z();
        SharedPreferences.Editor editorE = this.f6307b.e();
        editorE.putString(this.f6318m, str);
        L0(editorE);
        return true;
    }

    public Bundle k() {
        if (this.f6321p == null) {
            this.f6321p = new Bundle();
        }
        return this.f6321p;
    }

    public boolean k0(Set set) {
        if (!K0()) {
            return false;
        }
        if (set.equals(y(null))) {
            return true;
        }
        z();
        SharedPreferences.Editor editorE = this.f6307b.e();
        editorE.putStringSet(this.f6318m, set);
        L0(editorE);
        return true;
    }

    StringBuilder m() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence charSequenceE = E();
        if (!TextUtils.isEmpty(charSequenceE)) {
            sb2.append(charSequenceE);
            sb2.append(' ');
        }
        CharSequence charSequenceC = C();
        if (!TextUtils.isEmpty(charSequenceC)) {
            sb2.append(charSequenceC);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String n() {
        return this.f6320o;
    }

    void n0() {
        if (TextUtils.isEmpty(this.f6318m)) {
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
        this.f6324s = true;
    }

    long o() {
        return this.f6308c;
    }

    public void o0(Bundle bundle) {
        f(bundle);
    }

    public Intent p() {
        return this.f6319n;
    }

    public void p0(Bundle bundle) {
        g(bundle);
    }

    public String q() {
        return this.f6318m;
    }

    public void q0(Object obj) {
        this.f6327v = obj;
    }

    public final int r() {
        return this.G;
    }

    public void r0(boolean z10) {
        if (this.f6322q != z10) {
            this.f6322q = z10;
            N(J0());
            M();
        }
    }

    public int s() {
        return this.f6312g;
    }

    public PreferenceGroup t() {
        return this.K;
    }

    public void t0(int i10) {
        u0(i.a.b(this.f6306a, i10));
        this.f6316k = i10;
    }

    public String toString() {
        return m().toString();
    }

    protected boolean u(boolean z10) {
        if (!K0()) {
            return z10;
        }
        z();
        return this.f6307b.l().getBoolean(this.f6318m, z10);
    }

    public void u0(Drawable drawable) {
        if (this.f6317l != drawable) {
            this.f6317l = drawable;
            this.f6316k = 0;
            M();
        }
    }

    protected float v(float f10) {
        if (!K0()) {
            return f10;
        }
        z();
        return this.f6307b.l().getFloat(this.f6318m, f10);
    }

    public void v0(Intent intent) {
        this.f6319n = intent;
    }

    protected int w(int i10) {
        if (!K0()) {
            return i10;
        }
        z();
        return this.f6307b.l().getInt(this.f6318m, i10);
    }

    public void w0(String str) {
        this.f6318m = str;
        if (!this.f6324s || G()) {
            return;
        }
        n0();
    }

    protected String x(String str) {
        if (!K0()) {
            return str;
        }
        z();
        return this.f6307b.l().getString(this.f6318m, str);
    }

    public void x0(int i10) {
        this.G = i10;
    }

    public Set y(Set set) {
        if (!K0()) {
            return set;
        }
        z();
        return this.f6307b.l().getStringSet(this.f6318m, set);
    }

    final void y0(c cVar) {
        this.I = cVar;
    }

    public androidx.preference.e z() {
        j jVar = this.f6307b;
        if (jVar != null) {
            jVar.j();
        }
        return null;
    }

    public void z0(d dVar) {
        this.f6310e = dVar;
    }

    protected void T() {
    }

    public void X(o0.p pVar) {
    }

    protected void c0(Object obj) {
    }

    public Preference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d0.k.a(context, m.f6431h, R.attr.preferenceStyle));
    }

    public Preference(Context context) {
        this(context, null);
    }
}
