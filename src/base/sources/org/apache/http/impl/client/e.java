package org.apache.http.impl.client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.TreeSet;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class e implements fo.f, Serializable {
    private static final long serialVersionUID = -7581093305228232025L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TreeSet f49279a = new TreeSet(new uo.e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient ReadWriteLock f49280b = new ReentrantReadWriteLock();

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.f49280b = new ReentrantReadWriteLock();
    }

    @Override // fo.f
    public void a(uo.c cVar) {
        if (cVar != null) {
            this.f49280b.writeLock().lock();
            try {
                this.f49279a.remove(cVar);
                if (!cVar.l(new Date())) {
                    this.f49279a.add(cVar);
                }
            } finally {
                this.f49280b.writeLock().unlock();
            }
        }
    }

    public String toString() {
        this.f49280b.readLock().lock();
        try {
            return this.f49279a.toString();
        } finally {
            this.f49280b.readLock().unlock();
        }
    }
}
