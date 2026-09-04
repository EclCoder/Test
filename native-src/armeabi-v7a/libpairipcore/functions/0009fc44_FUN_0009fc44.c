/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0009fc44
 * Address  : 0009fc44
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0009fc44(int *param_1,int param_2,uint param_3,uint param_4)

{
  void *__ptr;
  int *piVar1;
  uint uVar2;
  uint uVar3;
  uint uVar4;
  uint *puVar5;
  int iVar6;
  
  puVar5 = (uint *)(param_2 + 8);
  uVar4 = *puVar5;
  uVar3 = *(uint *)(param_2 + 0xc);
  uVar2 = uVar3 + param_4 + (uint)CARRY4(uVar4,param_3);
  if ((!CARRY4(uVar3,param_4) && !CARRY4(uVar3 + param_4,(uint)CARRY4(uVar4,param_3))) &&
     (uVar2 < *(uint *)(param_2 + 0x14) ||
      *(uint *)(param_2 + 0x14) - uVar2 < (uint)(uVar4 + param_3 <= *(uint *)(param_2 + 0x10)))) {
    __ptr = malloc(param_3);
    if (__ptr != (void *)0x0) {
      uVar2 = FUN_00019718(3,*(undefined4 *)(param_2 + 4),__ptr,param_3);
      if (uVar2 < 0xfffff001) {
        if (0 < (int)uVar2) {
          if (uVar2 < 0xb) {
            iVar6 = (int)param_1 + 1;
            *(char *)param_1 = (char)(uVar2 << 1);
          }
          else {
            iVar6 = FUN_000a0370((uVar2 | 7) + 1);
            *param_1 = (uVar2 | 7) + 2;
            param_1[1] = uVar2;
            param_1[2] = iVar6;
          }
          __aeabi_memcpy(iVar6,__ptr,uVar2);
          *(undefined1 *)(iVar6 + uVar2) = 0;
          free(__ptr);
          uVar3 = *puVar5;
          *puVar5 = uVar3 + uVar2;
          *(uint *)(param_2 + 0xc) = *(int *)(param_2 + 0xc) + (uint)CARRY4(uVar3,uVar2);
          return;
        }
      }
      else {
        piVar1 = (int *)FUN_00025e6c(DAT_0009fd5c + 0x9fcd4);
        *piVar1 = -uVar2;
      }
      free(__ptr);
    }
    *(undefined2 *)param_1 = 0;
    return;
  }
  *(undefined2 *)param_1 = 0;
  return;
}


