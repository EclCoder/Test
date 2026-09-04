package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f3267a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f3268b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        Intent c();
    }

    private a0(Context context) {
        this.f3268b = context;
    }

    public static a0 f(Context context) {
        return new a0(context);
    }

    public a0 a(Intent intent) {
        this.f3267a.add(intent);
        return this;
    }

    public a0 b(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3268b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        a(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0 d(Activity activity) {
        Intent intentC = activity instanceof a ? ((a) activity).c() : null;
        if (intentC == null) {
            intentC = k.a(activity);
        }
        if (intentC != null) {
            ComponentName component = intentC.getComponent();
            if (component == null) {
                component = intentC.resolveActivity(this.f3268b.getPackageManager());
            }
            e(component);
            a(intentC);
        }
        return this;
    }

    public a0 e(ComponentName componentName) {
        int size = this.f3267a.size();
        try {
            Intent intentB = k.b(this.f3268b, componentName);
            while (intentB != null) {
                this.f3267a.add(size, intentB);
                intentB = k.b(this.f3268b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public Intent g(int i10) {
        return (Intent) this.f3267a.get(i10);
    }

    public int h() {
        return this.f3267a.size();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f3267a.iterator();
    }

    public void k() {
        m(null);
    }

    public void m(Bundle bundle) {
        if (this.f3267a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f3267a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.startActivities(this.f3268b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f3268b.startActivity(intent);
    }
}
