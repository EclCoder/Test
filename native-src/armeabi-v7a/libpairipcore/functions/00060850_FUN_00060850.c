/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00060850
 * Address  : 00060850
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_00060850(int *param_1)

{
  bool bVar1;
  int iVar2;
  int *piVar3;
  int *piVar4;
  int iVar5;
  int iVar6;
  int local_20;
  int local_1c;
  
  local_1c = **(int **)(DAT_000609a4 + 0x60870);
  iVar5 = param_1[0xf];
  *param_1 = DAT_000609a0 + 0x60874;
  if (iVar5 != 0) {
    iVar6 = param_1[0x10];
    iVar2 = iVar5;
    if (iVar5 != iVar6) {
      do {
        piVar3 = *(int **)(iVar6 + -4);
        if (piVar3 != (int *)0x0) {
          piVar4 = piVar3 + 1;
          DataMemoryBarrier(0xb);
          do {
            iVar2 = *piVar4;
            bVar1 = (bool)hasExclusiveAccess(piVar4);
          } while (!bVar1);
          *piVar4 = iVar2 + -1;
          DataMemoryBarrier(0xb);
          if (iVar2 == 0) {
            (**(code **)(*piVar3 + 8))(piVar3);
            FUN_00019dfe(piVar3);
          }
        }
        iVar6 = iVar6 + -8;
      } while (iVar5 != iVar6);
      iVar2 = param_1[0xf];
    }
    param_1[0x10] = iVar5;
    FUN_00023f68(iVar2,param_1[0x11] - iVar2);
  }
  iVar5 = param_1[4];
  param_1[4] = 0;
  if (iVar5 != 0) {
    piVar3 = (int *)param_1[10];
    local_20 = iVar5;
    if (piVar3 == (int *)0x0) {
                    /* WARNING: Subroutine does not return */
      FUN_000269a8();
    }
    (**(code **)(*piVar3 + 0x18))(piVar3,&local_20);
  }
  piVar3 = (int *)param_1[10];
  if (piVar3 == param_1 + 6) {
    iVar5 = 0x10;
  }
  else {
    iVar5 = 0x14;
    if (piVar3 == (int *)0x0) goto LAB_00060974;
  }
  (**(code **)(*piVar3 + iVar5))();
LAB_00060974:
  if (**(int **)(DAT_000609a8 + 0x60984) != local_1c) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail(local_1c);
  }
  return;
}


