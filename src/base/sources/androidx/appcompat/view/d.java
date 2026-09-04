package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f898f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f903e;

    public d(Context context, int i10) {
        super(context);
        this.f899a = i10;
    }

    private Resources b() {
        if (this.f903e == null) {
            Configuration configuration = this.f902d;
            if (configuration == null || (Build.VERSION.SDK_INT >= 26 && e(configuration))) {
                this.f903e = super.getResources();
            } else {
                this.f903e = createConfigurationContext(this.f902d).getResources();
            }
        }
        return this.f903e;
    }

    private void d() {
        boolean z10 = this.f900b == null;
        if (z10) {
            this.f900b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f900b.setTo(theme);
            }
        }
        f(this.f900b, this.f899a, z10);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f898f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f898f = configuration2;
        }
        return configuration.equals(f898f);
    }

    public void a(Configuration configuration) {
        if (this.f903e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f902d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f902d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f899a;
    }

    protected void f(Resources.Theme theme, int i10, boolean z10) {
        theme.applyStyle(i10, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f901c == null) {
            this.f901c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f901c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f900b;
        if (theme != null) {
            return theme;
        }
        if (this.f899a == 0) {
            this.f899a = h.i.f39993i;
        }
        d();
        return this.f900b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        if (this.f899a != i10) {
            this.f899a = i10;
            d();
        }
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f900b = theme;
    }
}
