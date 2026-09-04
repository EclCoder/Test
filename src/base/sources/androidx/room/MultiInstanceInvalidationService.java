package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f7076a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HashMap f7077b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final RemoteCallbackList f7078c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c.a f7079d = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends RemoteCallbackList {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            HashMap map = MultiInstanceInvalidationService.this.f7077b;
            Integer num = (Integer) obj;
            num.intValue();
            map.remove(num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public void A(androidx.room.b bVar, int i10) {
            synchronized (MultiInstanceInvalidationService.this.f7078c) {
                MultiInstanceInvalidationService.this.f7078c.unregister(bVar);
                MultiInstanceInvalidationService.this.f7077b.remove(Integer.valueOf(i10));
            }
        }

        @Override // androidx.room.c
        public void m(int i10, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f7078c) {
                try {
                    String str = (String) MultiInstanceInvalidationService.this.f7077b.get(Integer.valueOf(i10));
                    if (str == null) {
                        Log.w("ROOM", "Remote invalidation client ID not registered");
                        return;
                    }
                    int iBeginBroadcast = MultiInstanceInvalidationService.this.f7078c.beginBroadcast();
                    for (int i11 = 0; i11 < iBeginBroadcast; i11++) {
                        try {
                            Integer num = (Integer) MultiInstanceInvalidationService.this.f7078c.getBroadcastCookie(i11);
                            int iIntValue = num.intValue();
                            String str2 = (String) MultiInstanceInvalidationService.this.f7077b.get(num);
                            if (i10 != iIntValue && str.equals(str2)) {
                                try {
                                    ((androidx.room.b) MultiInstanceInvalidationService.this.f7078c.getBroadcastItem(i11)).d(strArr);
                                } catch (RemoteException e10) {
                                    Log.w("ROOM", "Error invoking a remote callback", e10);
                                }
                            }
                        } catch (Throwable th2) {
                            MultiInstanceInvalidationService.this.f7078c.finishBroadcast();
                            throw th2;
                        }
                    }
                    MultiInstanceInvalidationService.this.f7078c.finishBroadcast();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // androidx.room.c
        public int o(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f7078c) {
                try {
                    MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                    int i10 = multiInstanceInvalidationService.f7076a + 1;
                    multiInstanceInvalidationService.f7076a = i10;
                    if (multiInstanceInvalidationService.f7078c.register(bVar, Integer.valueOf(i10))) {
                        MultiInstanceInvalidationService.this.f7077b.put(Integer.valueOf(i10), str);
                        return i10;
                    }
                    MultiInstanceInvalidationService.this.f7076a--;
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f7079d;
    }
}
