package g5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.l;
import com.pairip.VMRunner;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f38925h = l.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f38926g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes2.dex */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VMRunner.invoke("P6gMdDhOWiHnpF5f", new Object[]{this, context, intent});
        }
    }

    public c(Context context, k5.a aVar) {
        super(context, aVar);
        this.f38926g = new a();
    }

    @Override // g5.d
    public void e() {
        l.c().a(f38925h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f38930b.registerReceiver(this.f38926g, g());
    }

    @Override // g5.d
    public void f() {
        l.c().a(f38925h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f38930b.unregisterReceiver(this.f38926g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
