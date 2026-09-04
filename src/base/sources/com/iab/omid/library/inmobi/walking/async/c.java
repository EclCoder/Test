package com.iab.omid.library.inmobi.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f24048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f24049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f24050c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f24051d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f24048a = linkedBlockingQueue;
        this.f24049b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f24050c.poll();
        this.f24051d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f24049b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f24050c.add(bVar);
        if (this.f24051d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.inmobi.walking.async.b.a
    public void a(b bVar) {
        this.f24051d = null;
        a();
    }
}
