package com.iab.omid.library.inmobi.adsession;

import android.view.View;
import com.iab.omid.library.inmobi.internal.c;
import com.iab.omid.library.inmobi.internal.e;
import com.iab.omid.library.inmobi.internal.f;
import com.iab.omid.library.inmobi.internal.i;
import com.iab.omid.library.inmobi.publisher.AdSessionStatePublisher;
import com.iab.omid.library.inmobi.publisher.b;
import com.iab.omid.library.inmobi.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f23918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f23919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f23920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.weakreference.a f23921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f23922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f23924g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23925h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23926i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23927j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f23928k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f23926i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f23927j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f23924g) {
            return;
        }
        this.f23920c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f23925h;
    }

    public AdSessionStatePublisher d() {
        return this.f23922e;
    }

    public View e() {
        return this.f23921d.get();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f23924g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f23920c.a();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void finish() {
        if (this.f23924g) {
            return;
        }
        this.f23921d.clear();
        removeAllFriendlyObstructions();
        this.f23924g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f23922e = null;
        this.f23928k = null;
    }

    public boolean g() {
        return this.f23928k != null;
    }

    public boolean h() {
        return this.f23923f && !this.f23924g;
    }

    public boolean i() {
        return this.f23924g;
    }

    public boolean j() {
        return this.f23919b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f23919b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f23923f;
    }

    void m() {
        a();
        d().g();
        this.f23926i = true;
    }

    void n() {
        b();
        d().h();
        this.f23927j = true;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f23924g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f23924g) {
            return;
        }
        this.f23920c.b();
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f23924g) {
            return;
        }
        this.f23920c.c(view);
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f23928k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.inmobi.adsession.AdSession
    public void start() {
        if (this.f23923f || this.f23922e == null) {
            return;
        }
        this.f23923f = true;
        c.c().c(this);
        this.f23922e.a(i.c().b());
        this.f23922e.a(com.iab.omid.library.inmobi.internal.a.a().b());
        this.f23922e.a(this, this.f23918a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f23920c = new f();
        this.f23923f = false;
        this.f23924g = false;
        this.f23919b = adSessionConfiguration;
        this.f23918a = adSessionContext;
        this.f23925h = str;
        b(null);
        this.f23922e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.inmobi.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f23922e.i();
        c.c().a(this);
        this.f23922e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f23921d.clear();
            }
        }
    }

    private void b(View view) {
        this.f23921d = new com.iab.omid.library.inmobi.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.inmobi.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.inmobi.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f23928k.onPossibleObstructionsDetected(this.f23925h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f23927j = true;
    }
}
