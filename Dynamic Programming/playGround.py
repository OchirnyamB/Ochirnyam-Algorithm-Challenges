arr = [1,2,3,4]
dp = [[] for i in range(len(arr)+1)]
for j in arr:
   for i in range(j, len(arr)+1):
       if j == i:
           dp[j].append([j])
       elif i-j>0:
           for sub in dp[i-j]:
               dp[i] += [sub + [j]]
print(dp[4])