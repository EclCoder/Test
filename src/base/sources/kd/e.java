package kd;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f43174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f43175b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Task f43176c = Tasks.forResult(null);

    e(ExecutorService executorService) {
        this.f43174a = executorService;
    }

    public static /* synthetic */ Task a(Runnable runnable, Task task) {
        runnable.run();
        return Tasks.forResult(null);
    }

    public static /* synthetic */ Task b(Callable callable, Task task) {
        return (Task) callable.call();
    }

    public ExecutorService c() {
        return this.f43174a;
    }

    public Task e(final Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.f43175b) {
            taskContinueWithTask = this.f43176c.continueWithTask(this.f43174a, new Continuation() { // from class: kd.d
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.a(runnable, task);
                }
            });
            this.f43176c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f43174a.execute(runnable);
    }

    public Task f(final Callable callable) {
        Task taskContinueWithTask;
        synchronized (this.f43175b) {
            taskContinueWithTask = this.f43176c.continueWithTask(this.f43174a, new Continuation() { // from class: kd.c
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return e.b(callable, task);
                }
            });
            this.f43176c = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }
}
