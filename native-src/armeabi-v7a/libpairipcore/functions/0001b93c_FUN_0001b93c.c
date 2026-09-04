/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0001b93c
 * Address  : 0001b93c
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0001b93c(int param_1,undefined4 *param_2,int param_3,int param_4,undefined4 param_5)

{
  int iVar1;
  undefined4 uVar2;
  bool bVar3;
  
  iVar1 = FUN_0001b62c(param_1,param_2[2],param_5);
  if (iVar1 == 0) {
    iVar1 = FUN_0001b62c(param_1,*param_2,param_5);
    if (iVar1 == 0) {
                    /* WARNING: Could not recover jumptable at 0x0001b9a8. Too many branches */
                    /* WARNING: Treating indirect jump as call */
      (**(code **)(**(int **)(param_1 + 8) + 0x18))(*(int **)(param_1 + 8),param_2,param_3,param_4);
      return;
    }
    iVar1 = param_2[4];
    bVar3 = param_3 != iVar1;
    if (bVar3) {
      iVar1 = param_2[5];
    }
    if (bVar3 && param_3 != iVar1) {
      param_2[8] = param_4;
      if (param_2[0xb] != 4) {
        *(undefined2 *)(param_2 + 0xd) = 0;
        (**(code **)(**(int **)(param_1 + 8) + 0x14))
                  (*(int **)(param_1 + 8),param_2,param_3,param_3,1,param_5);
        if (*(char *)((int)param_2 + 0x35) == '\x01') {
          uVar2 = 3;
          if (*(char *)(param_2 + 0xd) == '\x01') {
            param_2[0xb] = 3;
            return;
          }
        }
        else {
          uVar2 = 4;
        }
        param_2[0xb] = uVar2;
      }
      param_2[5] = param_3;
      param_2[10] = param_2[10] + 1;
      if ((param_2[9] == 1) && (param_2[6] == 2)) {
        *(undefined1 *)((int)param_2 + 0x36) = 1;
      }
    }
    else if (param_4 == 1) {
      param_2[8] = 1;
    }
  }
  else if ((param_3 == param_2[1]) && (param_2[7] != 1)) {
    param_2[7] = param_4;
  }
  return;
}


