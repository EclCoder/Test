package com.iab.omid.library.vungle.adsession;

import android.view.View;
import com.iab.omid.library.vungle.internal.c;
import com.iab.omid.library.vungle.internal.e;
import com.iab.omid.library.vungle.internal.f;
import com.iab.omid.library.vungle.internal.i;
import com.iab.omid.library.vungle.publisher.AdSessionStatePublisher;
import com.iab.omid.library.vungle.publisher.b;
import com.iab.omid.library.vungle.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f24194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f24195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f24196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.weakreference.a f24197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f24198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f24199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f24201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f24203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f24204k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f24202i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f24203j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        if (this.f24200g) {
            return;
        }
        this.f24196c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f24201h;
    }

    public AdSessionStatePublisher d() {
        return this.f24198e;
    }

    public View e() {
        return this.f24197d.get();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f24200g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f24196c.a();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void finish() {
        if (this.f24200g) {
            return;
        }
        this.f24197d.clear();
        removeAllFriendlyObstructions();
        this.f24200g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f24198e = null;
        this.f24204k = null;
    }

    public boolean g() {
        return this.f24204k != null;
    }

    public boolean h() {
        return this.f24199f && !this.f24200g;
    }

    public boolean i() {
        return this.f24200g;
    }

    public boolean j() {
        return this.f24195b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f24195b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f24199f;
    }

    void m() {
        a();
        d().g();
        this.f24202i = true;
    }

    void n() {
        b();
        d().h();
        this.f24203j = true;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f24200g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f24200g) {
            return;
        }
        this.f24196c.b();
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f24200g) {
            return;
        }
        this.f24196c.c(view);
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f24204k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.vungle.adsession.AdSession
    public void start() {
        if (this.f24199f || this.f24198e == null) {
            return;
        }
        this.f24199f = true;
        c.c().c(this);
        this.f24198e.a(i.c().b());
        this.f24198e.a(com.iab.omid.library.vungle.internal.a.a().b());
        this.f24198e.b(com.iab.omid.library.vungle.attestation.c.a(com.iab.omid.library.vungle.internal.g.b().a()).a());
        this.f24198e.a(this, this.f24194a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f24196c = new f();
        this.f24199f = false;
        this.f24200g = false;
        this.f24195b = adSessionConfiguration;
        this.f24194a = adSessionContext;
        this.f24201h = str;
        b(null);
        this.f24198e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.vungle.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f24198e.i();
        c.c().a(this);
        this.f24198e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f24197d.clear();
            }
        }
    }

    private void b(View view) {
        this.f24197d = new com.iab.omid.library.vungle.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.vungle.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.vungle.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f24204k.onPossibleObstructionsDetected(this.f24201h, arrayList);
        }
    }

    void a(JSONObject jSONObject) {
        b();
        d().b(jSONObject);
        this.f24203j = true;
    }
}
