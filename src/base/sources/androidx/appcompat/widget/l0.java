package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f1647c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ArrayList f1648d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources.Theme f1650b;

    private l0(Context context) {
        super(context);
        if (!y0.c()) {
            this.f1649a = new n0(this, context.getResources());
            this.f1650b = null;
            return;
        }
        y0 y0Var = new y0(this, context.getResources());
        this.f1649a = y0Var;
        Resources.Theme themeNewTheme = y0Var.newTheme();
        this.f1650b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        return ((context instanceof l0) || (context.getResources() instanceof n0) || (context.getResources() instanceof y0) || !y0.c()) ? false : true;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1647c) {
            try {
                ArrayList arrayList = f1648d;
                if (arrayList == null) {
                    f1648d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f1648d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1648d.remove(size);
                        }
                    }
                    for (int size2 = f1648d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f1648d.get(size2);
                        l0 l0Var = weakReference2 != null ? (l0) weakReference2.get() : null;
                        if (l0Var != null && l0Var.getBaseContext() == context) {
                            return l0Var;
                        }
                    }
                }
                l0 l0Var2 = new l0(context);
                f1648d.add(new WeakReference(l0Var2));
                return l0Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1649a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1649a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1650b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        Resources.Theme theme = this.f1650b;
        if (theme == null) {
            super.setTheme(i10);
        } else {
            theme.applyStyle(i10, true);
        }
    }
}
