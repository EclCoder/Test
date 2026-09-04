package com.google.api.client.http;

import com.google.api.client.util.ExponentialBackOff;
import com.google.api.client.util.NanoClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class ExponentialBackOffPolicy implements BackOffPolicy {
    public static final int DEFAULT_INITIAL_INTERVAL_MILLIS = 500;
    public static final int DEFAULT_MAX_ELAPSED_TIME_MILLIS = 900000;
    public static final int DEFAULT_MAX_INTERVAL_MILLIS = 60000;
    public static final double DEFAULT_MULTIPLIER = 1.5d;
    public static final double DEFAULT_RANDOMIZATION_FACTOR = 0.5d;
    private final ExponentialBackOff exponentialBackOff;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Deprecated
    public static class Builder {
        final ExponentialBackOff.Builder exponentialBackOffBuilder = new ExponentialBackOff.Builder();

        protected Builder() {
        }

        public ExponentialBackOffPolicy build() {
            return new ExponentialBackOffPolicy(this);
        }

        public final int getInitialIntervalMillis() {
            return this.exponentialBackOffBuilder.getInitialIntervalMillis();
        }

        public final int getMaxElapsedTimeMillis() {
            return this.exponentialBackOffBuilder.getMaxElapsedTimeMillis();
        }

        public final int getMaxIntervalMillis() {
            return this.exponentialBackOffBuilder.getMaxIntervalMillis();
        }

        public final double getMultiplier() {
            return this.exponentialBackOffBuilder.getMultiplier();
        }

        public final NanoClock getNanoClock() {
            return this.exponentialBackOffBuilder.getNanoClock();
        }

        public final double getRandomizationFactor() {
            return this.exponentialBackOffBuilder.getRandomizationFactor();
        }

        public Builder setInitialIntervalMillis(int i10) {
            this.exponentialBackOffBuilder.setInitialIntervalMillis(i10);
            return this;
        }

        public Builder setMaxElapsedTimeMillis(int i10) {
            this.exponentialBackOffBuilder.setMaxElapsedTimeMillis(i10);
            return this;
        }

        public Builder setMaxIntervalMillis(int i10) {
            this.exponentialBackOffBuilder.setMaxIntervalMillis(i10);
            return this;
        }

        public Builder setMultiplier(double d10) {
            this.exponentialBackOffBuilder.setMultiplier(d10);
            return this;
        }

        public Builder setNanoClock(NanoClock nanoClock) {
            this.exponentialBackOffBuilder.setNanoClock(nanoClock);
            return this;
        }

        public Builder setRandomizationFactor(double d10) {
            this.exponentialBackOffBuilder.setRandomizationFactor(d10);
            return this;
        }
    }

    public ExponentialBackOffPolicy() {
        this(new Builder());
    }

    public static Builder builder() {
        return new Builder();
    }

    public final int getCurrentIntervalMillis() {
        return this.exponentialBackOff.getCurrentIntervalMillis();
    }

    public final long getElapsedTimeMillis() {
        return this.exponentialBackOff.getElapsedTimeMillis();
    }

    public final int getInitialIntervalMillis() {
        return this.exponentialBackOff.getInitialIntervalMillis();
    }

    public final int getMaxElapsedTimeMillis() {
        return this.exponentialBackOff.getMaxElapsedTimeMillis();
    }

    public final int getMaxIntervalMillis() {
        return this.exponentialBackOff.getMaxIntervalMillis();
    }

    public final double getMultiplier() {
        return this.exponentialBackOff.getMultiplier();
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public long getNextBackOffMillis() {
        return this.exponentialBackOff.nextBackOffMillis();
    }

    public final double getRandomizationFactor() {
        return this.exponentialBackOff.getRandomizationFactor();
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public boolean isBackOffRequired(int i10) {
        return i10 == 500 || i10 == 503;
    }

    @Override // com.google.api.client.http.BackOffPolicy
    public final void reset() {
        this.exponentialBackOff.reset();
    }

    protected ExponentialBackOffPolicy(Builder builder) {
        this.exponentialBackOff = builder.exponentialBackOffBuilder.build();
    }
}
