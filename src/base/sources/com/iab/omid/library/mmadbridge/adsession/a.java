package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f24062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24069k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f24067i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f24068j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24065g) {
            return;
        }
        this.f24061c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f24062d.get();
    }

    public List<e> d() {
        return this.f24061c.a();
    }

    public boolean e() {
        return this.f24069k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24065g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f24064f && !this.f24065g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f24065g) {
            return;
        }
        this.f24062d.clear();
        removeAllFriendlyObstructions();
        this.f24065g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f24063e = null;
        this.f24069k = null;
    }

    public boolean g() {
        return this.f24065g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f24066h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f24063e;
    }

    public boolean h() {
        return this.f24060b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f24060b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f24064f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f24067i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f24068j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24065g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24065g) {
            return;
        }
        this.f24061c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24065g) {
            return;
        }
        this.f24061c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24069k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f24064f) {
            return;
        }
        this.f24064f = true;
        c.c().c(this);
        this.f24063e.a(i.c().b());
        this.f24063e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f24063e.a(this, this.f24059a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24061c = new f();
        this.f24064f = false;
        this.f24065g = false;
        this.f24060b = adSessionConfiguration;
        this.f24059a = adSessionContext;
        this.f24066h = str;
        b(null);
        this.f24063e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24063e.i();
        c.c().a(this);
        this.f24063e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f24062d.clear();
            }
        }
    }

    private void b(View view) {
        this.f24062d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24069k.onPossibleObstructionsDetected(this.f24066h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f24068j = true;
    }
}
