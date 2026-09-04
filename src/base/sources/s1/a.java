package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f51452f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static a f51453g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f51454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f51455b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f51456c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayList f51457d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f51458e;

    /* JADX INFO: renamed from: s1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class HandlerC0796a extends Handler {
        HandlerC0796a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Intent f51460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f51461b;

        b(Intent intent, ArrayList arrayList) {
            this.f51460a = intent;
            this.f51461b = arrayList;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final IntentFilter f51462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f51463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f51464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f51465d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f51462a = intentFilter;
            this.f51463b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f51463b);
            sb2.append(" filter=");
            sb2.append(this.f51462a);
            if (this.f51465d) {
                sb2.append(" DEAD");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    private a(Context context) {
        this.f51454a = context;
        this.f51458e = new HandlerC0796a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (f51452f) {
            try {
                if (f51453g == null) {
                    f51453g = new a(context.getApplicationContext());
                }
                aVar = f51453g;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f51455b) {
                try {
                    size = this.f51457d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f51457d.toArray(bVarArr);
                    this.f51457d.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            for (int i10 = 0; i10 < size; i10++) {
                b bVar = bVarArr[i10];
                int size2 = bVar.f51461b.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c cVar = (c) bVar.f51461b.get(i11);
                    if (!cVar.f51465d) {
                        cVar.f51463b.onReceive(this.f51454a, bVar.f51460a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f51455b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList arrayList = (ArrayList) this.f51455b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    this.f51455b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                    String action = intentFilter.getAction(i10);
                    ArrayList arrayList2 = (ArrayList) this.f51456c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                        this.f51456c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean d(Intent intent) {
        String str;
        synchronized (this.f51455b) {
            try {
                String action = intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f51454a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z10 = (intent.getFlags() & 8) != 0;
                if (z10) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f51456c.get(intent.getAction());
                if (arrayList != null) {
                    if (z10) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    ArrayList arrayList2 = null;
                    int i10 = 0;
                    while (i10 < arrayList.size()) {
                        c cVar = (c) arrayList.get(i10);
                        if (z10) {
                            Log.v("LocalBroadcastManager", "Matching against filter " + cVar.f51462a);
                        }
                        if (cVar.f51464c) {
                            if (z10) {
                                Log.v("LocalBroadcastManager", "  Filter's target already added");
                            }
                            action = action;
                        } else {
                            int iMatch = cVar.f51462a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                            if (iMatch >= 0) {
                                if (z10) {
                                    Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                                }
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                }
                                arrayList2.add(cVar);
                                cVar.f51464c = true;
                            } else {
                                action = action;
                                if (z10) {
                                    if (iMatch == -4) {
                                        str = "category";
                                    } else if (iMatch == -3) {
                                        str = "action";
                                    } else if (iMatch != -2) {
                                        str = iMatch != -1 ? "unknown reason" : "type";
                                    } else {
                                        str = DataSchemeDataSource.SCHEME_DATA;
                                    }
                                    Log.v("LocalBroadcastManager", "  Filter did not match: " + str);
                                }
                            }
                        }
                        i10++;
                        action = action;
                    }
                    if (arrayList2 != null) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            ((c) arrayList2.get(i11)).f51464c = false;
                        }
                        this.f51457d.add(new b(intent, arrayList2));
                        if (!this.f51458e.hasMessages(1)) {
                            this.f51458e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f51455b) {
            try {
                ArrayList arrayList = (ArrayList) this.f51455b.remove(broadcastReceiver);
                if (arrayList == null) {
                    return;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    c cVar = (c) arrayList.get(size);
                    cVar.f51465d = true;
                    for (int i10 = 0; i10 < cVar.f51462a.countActions(); i10++) {
                        String action = cVar.f51462a.getAction(i10);
                        ArrayList arrayList2 = (ArrayList) this.f51456c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList2.get(size2);
                                if (cVar2.f51463b == broadcastReceiver) {
                                    cVar2.f51465d = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                this.f51456c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
