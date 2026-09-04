package m;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class a implements g0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f45025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f45026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f45027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private CharSequence f45028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f45029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Intent f45030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char f45031g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private char f45033i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f45035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f45036l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuItem.OnMenuItemClickListener f45037m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f45038n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f45039o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f45032h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f45034j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorStateList f45040p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private PorterDuff.Mode f45041q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f45042r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f45043s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f45044t = 16;

    public a(Context context, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f45036l = context;
        this.f45025a = i11;
        this.f45026b = i10;
        this.f45027c = i13;
        this.f45028d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f45035k;
        if (drawable != null) {
            if (this.f45042r || this.f45043s) {
                Drawable drawableR = f0.a.r(drawable);
                this.f45035k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f45035k = drawableMutate;
                if (this.f45042r) {
                    f0.a.o(drawableMutate, this.f45040p);
                }
                if (this.f45043s) {
                    f0.a.p(this.f45035k, this.f45041q);
                }
            }
        }
    }

    @Override // g0.b
    public g0.b a(n0.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b
    public n0.b b() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g0.b setActionView(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g0.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public g0.b setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // g0.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f45034j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f45033i;
    }

    @Override // g0.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f45038n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f45026b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f45035k;
    }

    @Override // g0.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f45040p;
    }

    @Override // g0.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f45041q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f45030f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f45025a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // g0.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f45032h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f45031g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f45027c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f45028d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f45029e;
        return charSequence != null ? charSequence : this.f45028d;
    }

    @Override // g0.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f45039o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // g0.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f45044t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f45044t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f45044t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f45044t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f45033i = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f45044t = (z10 ? 1 : 0) | (this.f45044t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f45044t = (z10 ? 2 : 0) | (this.f45044t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f45044t = (z10 ? 16 : 0) | (this.f45044t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f45035k = drawable;
        c();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f45040p = colorStateList;
        this.f45042r = true;
        c();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f45041q = mode;
        this.f45043s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f45030f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f45031g = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f45037m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f45031g = c10;
        this.f45033i = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f45028d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f45029e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        this.f45044t = (this.f45044t & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f45033i = Character.toLowerCase(c10);
        this.f45034j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public g0.b setContentDescription(CharSequence charSequence) {
        this.f45038n = charSequence;
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f45031g = c10;
        this.f45032h = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f45028d = this.f45036l.getResources().getString(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public g0.b setTooltipText(CharSequence charSequence) {
        this.f45039o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f45035k = androidx.core.content.a.getDrawable(this.f45036l, i10);
        c();
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f45031g = c10;
        this.f45032h = KeyEvent.normalizeMetaState(i10);
        this.f45033i = Character.toLowerCase(c11);
        this.f45034j = KeyEvent.normalizeMetaState(i11);
        return this;
    }

    @Override // g0.b, android.view.MenuItem
    public void setShowAsAction(int i10) {
    }
}
