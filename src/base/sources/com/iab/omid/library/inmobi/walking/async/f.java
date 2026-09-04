package com.iab.omid.library.inmobi.walking.async;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class f extends a {
    public f(b.InterfaceC0353b interfaceC0353b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0353b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.inmobi.internal.c cVarC = com.iab.omid.library.inmobi.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.inmobi.adsession.a aVar : cVarC.b()) {
                if (this.f24043c.contains(aVar.c())) {
                    aVar.d().b(str, this.f24045e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.inmobi.utils.c.h(this.f24044d, this.f24047b.a())) {
            return null;
        }
        this.f24047b.a(this.f24044d);
        return this.f24044d.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.iab.omid.library.inmobi.walking.async.b, android.os.AsyncTask
    /* JADX INFO: renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
