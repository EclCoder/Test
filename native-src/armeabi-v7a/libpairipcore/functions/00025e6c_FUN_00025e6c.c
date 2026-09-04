/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00025e6c
 * Address  : 00025e6c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void * FUN_00025e6c(size_t *param_1)

{
  undefined4 *__ptr;
  void *pvVar1;
  uint uVar2;
  void *__s;
  int iVar3;
  size_t __n;
  uint uVar4;
  
  iVar3 = DAT_00025f7c;
  uVar4 = param_1[2];
  DataMemoryBarrier(0x1b);
  if (uVar4 == 0) {
    pthread_once((pthread_once_t *)(DAT_00025f7c + 0x25e8a),
                 (__init_routine *)(DAT_00025f80 + 0x25e88));
    pthread_mutex_lock((pthread_mutex_t *)(iVar3 + 0x25e8e));
    uVar4 = param_1[2];
    if (uVar4 == 0) {
      uVar4 = *(int *)(iVar3 + 0x25e86) + 1;
      *(uint *)(iVar3 + 0x25e86) = uVar4;
      DataMemoryBarrier(0x1b);
      param_1[2] = uVar4;
    }
    pthread_mutex_unlock((pthread_mutex_t *)(iVar3 + 0x25e8e));
  }
  __ptr = pthread_getspecific(*(pthread_key_t *)(iVar3 + 0x25e82));
  if (__ptr == (undefined4 *)0x0) {
    iVar3 = (uVar4 + 0x11 & 0xfffffff0) - 2;
    __ptr = malloc(iVar3 * 4 + 8);
    if (__ptr != (undefined4 *)0x0) {
      memset(__ptr + 2,0,iVar3 * 4);
      *__ptr = 1;
    }
  }
  else {
    uVar2 = __ptr[1];
    if (uVar4 <= uVar2) goto LAB_00025f1a;
    iVar3 = (uVar4 + 0x11 & 0xfffffff0) - 2;
    __ptr = realloc(__ptr,iVar3 * 4 + 8);
    if (__ptr != (undefined4 *)0x0) {
      memset(__ptr + uVar2 + 2,0,(iVar3 - uVar2) * 4);
    }
  }
  FUN_00026010(__ptr,iVar3);
LAB_00025f1a:
  __s = (void *)__ptr[uVar4 + 1];
  if (__s == (void *)0x0) {
    uVar2 = param_1[1];
    if (uVar2 < 5) {
      uVar2 = 4;
    }
    if ((uVar2 & uVar2 - 1) != 0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    __n = *param_1;
    pvVar1 = malloc(uVar2 + 3 + __n);
    if (pvVar1 == (void *)0x0) {
                    /* WARNING: Subroutine does not return */
      abort();
    }
    __s = (void *)((int)pvVar1 + uVar2 + 3 & -uVar2);
    *(void **)((int)__s + -4) = pvVar1;
    if ((void *)param_1[3] == (void *)0x0) {
      memset(__s,0,__n);
    }
    else {
      memcpy(__s,(void *)param_1[3],__n);
    }
    __ptr[uVar4 + 1] = __s;
  }
  return __s;
}


