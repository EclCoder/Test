package nh;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.services.RecordService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements OnCompleteListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ lg.a f47740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.google.firebase.remoteconfig.a f47741b;

        a(lg.a aVar, com.google.firebase.remoteconfig.a aVar2) {
            this.f47740a = aVar;
            this.f47741b = aVar2;
        }

        private void a() {
            this.f47740a.m(R.string.pref_current_promo_product, "");
            this.f47740a.l(R.string.pref_current_promo_start_time, 0L);
            this.f47740a.l(R.string.pref_current_promo_duration, 0L);
        }

        private void b(String str, long j10) {
            androidx.collection.b bVar = new androidx.collection.b(this.f47740a.i(R.string.pref_expired_promo_products, new androidx.collection.b()));
            Object obj = "";
            String strH = this.f47740a.h(R.string.pref_current_promo_product, "");
            if (strH.isEmpty()) {
                obj = strH;
            } else {
                int iG = l0.g(this.f47740a);
                if (iG == 3) {
                    bVar.add(strH);
                    this.f47740a.n(R.string.pref_expired_promo_products, bVar);
                    a();
                } else if (iG != 1 || str.equals(strH)) {
                    if (iG != -1) {
                        return;
                    }
                    obj = strH;
                } else {
                    wp.a.a("Replacing pending promo %s with %s", strH, str);
                    a();
                }
            }
            if (bVar.contains(str) || str.equals(obj)) {
                return;
            }
            this.f47740a.m(R.string.pref_current_promo_product, str);
            this.f47740a.l(R.string.pref_current_promo_start_time, 0L);
            this.f47740a.l(R.string.pref_current_promo_duration, j10);
        }

        private void c() {
            try {
                JSONArray jSONArray = new JSONObject(this.f47741b.k("available_upgrade_products")).getJSONArray("products");
                androidx.collection.b bVar = new androidx.collection.b();
                androidx.collection.b bVar2 = new androidx.collection.b();
                androidx.collection.b bVar3 = new androidx.collection.b();
                String str = "";
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        String string = jSONObject.getString("id");
                        String string2 = jSONObject.getString("type");
                        if ("onetime".equals(string2)) {
                            bVar.add(string);
                        } else {
                            if ("subscription".equals(string2)) {
                                bVar2.add(string);
                            } else {
                                wp.a.d("Unknown product type %s for %s", string2, string);
                            }
                        }
                        if (jSONObject.has("promo_duration_ms")) {
                            b(string, jSONObject.getLong("promo_duration_ms"));
                        } else {
                            bVar3.add(string);
                        }
                        if (jSONObject.optBoolean("anchor", false)) {
                            str = string;
                        }
                    } catch (JSONException e10) {
                        wp.a.e(e10);
                        com.google.firebase.crashlytics.a.b().d(e10);
                    }
                }
                this.f47740a.n(R.string.pref_all_inapp_products, bVar);
                this.f47740a.n(R.string.pref_all_subs_products, bVar2);
                this.f47740a.n(R.string.pref_shown_products, bVar3);
                this.f47740a.m(R.string.pref_anchor_product, str);
            } catch (JSONException e11) {
                wp.a.e(e11);
                com.google.firebase.crashlytics.a.b().d(e11);
            }
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(Task task) {
            c();
            j.g(this.f47741b, 1);
        }
    }

    public static /* synthetic */ void c(final int i10, final com.google.firebase.remoteconfig.a aVar, Task task) {
        if (task.isSuccessful() || i10 >= 30 || !RecordService.r()) {
            return;
        }
        wp.a.a("Remote Config fetch attempt %d failed, retrying", Integer.valueOf(i10));
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: nh.i
            @Override // java.lang.Runnable
            public final void run() {
                j.g(aVar, i10 + 1);
            }
        };
        long j10 = i10;
        handler.postDelayed(runnable, 1000 * j10 * j10);
    }

    public static /* synthetic */ void d(Exception exc) {
        wp.a.e(exc);
        com.google.firebase.crashlytics.a.b().d(exc);
    }

    public static void f(lg.a aVar) {
        final com.google.firebase.remoteconfig.a aVarH = com.google.firebase.remoteconfig.a.h();
        aVarH.n(new je.i.b().d(3600L).c());
        final a aVar2 = new a(aVar, aVarH);
        aVarH.p(R.xml.remote_config_defaults).addOnCompleteListener(new OnCompleteListener() { // from class: nh.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                aVarH.f().addOnCompleteListener(aVar2);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: nh.g
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                j.d(exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final com.google.firebase.remoteconfig.a aVar, final int i10) {
        aVar.g().addOnCompleteListener(new OnCompleteListener() { // from class: nh.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                j.c(i10, aVar, task);
            }
        });
    }
}
