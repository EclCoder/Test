package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g implements g0.b {
    private View A;
    private n0.b B;
    private MenuItem.OnActionExpandListener C;
    private ContextMenu.ContextMenuInfo E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f1089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f1091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f1092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Intent f1093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private char f1094h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private char f1096j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Drawable f1098l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    e f1100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private m f1101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Runnable f1102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f1103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private CharSequence f1104r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f1105s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1112z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f1095i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1097k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f1099m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ColorStateList f1106t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private PorterDuff.Mode f1107u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f1108v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f1109w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f1110x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f1111y = 16;
    private boolean D = false;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n0.b.InterfaceC0717b {
        a() {
        }

        @Override // n0.b.InterfaceC0717b
        public void onActionProviderVisibilityChanged(boolean z10) {
            g gVar = g.this;
            gVar.f1100n.M(gVar);
        }
    }

    g(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f1100n = eVar;
        this.f1087a = i11;
        this.f1088b = i10;
        this.f1089c = i12;
        this.f1090d = i13;
        this.f1091e = charSequence;
        this.f1112z = i14;
    }

    private static void d(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.f1110x && (this.f1108v || this.f1109w)) {
            drawable = f0.a.r(drawable).mutate();
            if (this.f1108v) {
                f0.a.o(drawable, this.f1106t);
            }
            if (this.f1109w) {
                f0.a.p(drawable, this.f1107u);
            }
            this.f1110x = false;
        }
        return drawable;
    }

    boolean A() {
        return this.f1100n.K() && g() != 0;
    }

    public boolean B() {
        return (this.f1112z & 4) == 4;
    }

    @Override // g0.b
    public g0.b a(n0.b bVar) {
        n0.b bVar2 = this.B;
        if (bVar2 != null) {
            bVar2.g();
        }
        this.A = null;
        this.B = bVar;
        this.f1100n.N(true);
        n0.b bVar3 = this.B;
        if (bVar3 != null) {
            bVar3.i(new a());
        }
        return this;
    }

    @Override // g0.b
    public n0.b b() {
        return this.B;
    }

    public void c() {
        this.f1100n.L(this);
    }

    @Override // g0.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1112z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1100n.f(this);
        }
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1100n.m(this);
        }
        return false;
    }

    public int f() {
        return this.f1090d;
    }

    char g() {
        return this.f1100n.J() ? this.f1096j : this.f1094h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // g0.b, android.view.MenuItem
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        n0.b bVar = this.B;
        if (bVar == null) {
            return null;
        }
        View viewC = bVar.c(this);
        this.A = viewC;
        return viewC;
    }

    @Override // g0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1097k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1096j;
    }

    @Override // g0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1104r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1088b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1098l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f1099m == 0) {
            return null;
        }
        Drawable drawableB = i.a.b(this.f1100n.w(), this.f1099m);
        this.f1099m = 0;
        this.f1098l = drawableB;
        return e(drawableB);
    }

    @Override // g0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1106t;
    }

    @Override // g0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1107u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1093g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1087a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // g0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1095i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1094h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1089c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1101o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1091e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1092f;
        return charSequence != null ? charSequence : this.f1091e;
    }

    @Override // g0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1105s;
    }

    String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f1100n.w().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1100n.w()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(h.h.f39983n));
        }
        int i10 = this.f1100n.J() ? this.f1097k : this.f1095i;
        d(sb2, i10, C.DEFAULT_BUFFER_SEGMENT_SIZE, resources.getString(h.h.f39979j));
        d(sb2, i10, 4096, resources.getString(h.h.f39975f));
        d(sb2, i10, 2, resources.getString(h.h.f39974e));
        d(sb2, i10, 1, resources.getString(h.h.f39980k));
        d(sb2, i10, 4, resources.getString(h.h.f39982m));
        d(sb2, i10, 8, resources.getString(h.h.f39978i));
        if (cG == '\b') {
            sb2.append(resources.getString(h.h.f39976g));
        } else if (cG == '\n') {
            sb2.append(resources.getString(h.h.f39977h));
        } else if (cG != ' ') {
            sb2.append(cG);
        } else {
            sb2.append(resources.getString(h.h.f39981l));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1101o != null;
    }

    CharSequence i(k.a aVar) {
        return (aVar == null || !aVar.d()) ? getTitle() : getTitleCondensed();
    }

    @Override // g0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1111y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1111y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1111y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        n0.b bVar = this.B;
        if (bVar == null || !bVar.f()) {
            return (this.f1111y & 8) == 0;
        }
        return (this.f1111y & 8) == 0 && this.B.b();
    }

    public boolean j() {
        n0.b bVar;
        if ((this.f1112z & 8) != 0) {
            if (this.A == null && (bVar = this.B) != null) {
                this.A = bVar.c(this);
            }
            if (this.A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1103q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f1100n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f1102p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1093g != null) {
            try {
                this.f1100n.w().startActivity(this.f1093g);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
            }
        }
        n0.b bVar = this.B;
        return bVar != null && bVar.d();
    }

    public boolean l() {
        return (this.f1111y & 32) == 32;
    }

    public boolean m() {
        return (this.f1111y & 4) != 0;
    }

    public boolean n() {
        return (this.f1112z & 1) == 1;
    }

    public boolean o() {
        return (this.f1112z & 2) == 2;
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g0.b setActionView(int i10) {
        Context contextW = this.f1100n.w();
        setActionView(LayoutInflater.from(contextW).inflate(i10, (ViewGroup) new LinearLayout(contextW), false));
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public g0.b setActionView(View view) {
        int i10;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i10 = this.f1087a) > 0) {
            view.setId(i10);
        }
        this.f1100n.L(this);
        return this;
    }

    public void r(boolean z10) {
        this.D = z10;
        this.f1100n.N(false);
    }

    void s(boolean z10) {
        int i10 = this.f1111y;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.f1111y = i11;
        if (i10 != i11) {
            this.f1100n.N(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f1096j == c10) {
            return this;
        }
        this.f1096j = Character.toLowerCase(c10);
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.f1111y;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.f1111y = i11;
        if (i10 != i11) {
            this.f1100n.N(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.f1111y & 4) != 0) {
            this.f1100n.Y(this);
            return this;
        }
        s(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f1111y |= 16;
        } else {
            this.f1111y &= -17;
        }
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1099m = 0;
        this.f1098l = drawable;
        this.f1110x = true;
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1106t = colorStateList;
        this.f1108v = true;
        this.f1110x = true;
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1107u = mode;
        this.f1109w = true;
        this.f1110x = true;
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1093g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f1094h == c10) {
            return this;
        }
        this.f1094h = c10;
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1103q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f1094h = c10;
        this.f1096j = Character.toLowerCase(c11);
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1112z = i10;
        this.f1100n.L(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1091e = charSequence;
        this.f1100n.N(false);
        m mVar = this.f1101o;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1092f = charSequence;
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (y(z10)) {
            this.f1100n.M(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.f1111y = (z10 ? 4 : 0) | (this.f1111y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1091e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z10) {
        if (z10) {
            this.f1111y |= 32;
        } else {
            this.f1111y &= -33;
        }
    }

    void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public g0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    public void x(m mVar) {
        this.f1101o = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    boolean y(boolean z10) {
        int i10 = this.f1111y;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.f1111y = i11;
        return i10 != i11;
    }

    public boolean z() {
        return this.f1100n.C();
    }

    @Override // android.view.MenuItem
    public g0.b setContentDescription(CharSequence charSequence) {
        this.f1104r = charSequence;
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public g0.b setTooltipText(CharSequence charSequence) {
        this.f1105s = charSequence;
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f1096j == c10 && this.f1097k == i10) {
            return this;
        }
        this.f1096j = Character.toLowerCase(c10);
        this.f1097k = KeyEvent.normalizeMetaState(i10);
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f1094h == c10 && this.f1095i == i10) {
            return this;
        }
        this.f1094h = c10;
        this.f1095i = KeyEvent.normalizeMetaState(i10);
        this.f1100n.N(false);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f1094h = c10;
        this.f1095i = KeyEvent.normalizeMetaState(i10);
        this.f1096j = Character.toLowerCase(c11);
        this.f1097k = KeyEvent.normalizeMetaState(i11);
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f1098l = null;
        this.f1099m = i10;
        this.f1110x = true;
        this.f1100n.N(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f1100n.w().getString(i10));
    }
}
