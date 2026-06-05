'''import re
def lines_count(file_path):
    file_path = open("server_log.txt","r")
    count = file_path.readlines()
    file_path.close
    print("Total Lines:",len(count))

def char_vowel_word_count(file_path):

    file_path = open("server_log.txt","r")
    content = file_path.read()

    vowel=0
    words=1
    for i in content:
        i = i.lower()
        if i=='a' or i=='e' or i=='i' or i=='o' or i=='u':
            vowel+=1
        elif i==" ": words+=1
    print("Total characters:",len(content))
    print("Total Words: ",words)
    print("Total vowels: ",vowel)

file_path = open("server_log.txt","w")
file_path.writelines([INFO] 2025-06-01 09:00:01 - Service started
[WARNING] 2025-06-01 09:05:12 - High memory
[ERROR] 2025-06-01 09:10:44 - DB connection failed
[INFO] 2025-06-01 09:15:00 - Request processed
[CRITICAL] 2025-06-01 09:20:33 - Disk full)
file_path.close

file_path = "server_log.txt"

lines_count(file_path)
char_vowel_word_count(file_path)'''

import re

# Create log file
with open("server_log.txt", "w") as file:
    file.write("""[INFO] 2025-06-01 09:00:01 - Service started
[WARNING] 2025-06-01 09:05:12 - High memory
[ERROR] 2025-06-01 09:10:44 - DB connection failed
[INFO] 2025-06-01 09:15:00 - Request processed
[CRITICAL] 2025-06-01 09:20:33 - Disk full""")

# Read file
with open("server_log.txt", "r") as file:
    content = file.read()

with open("server_log.txt", "r") as file:
    lines = file.readlines()

# Count lines, words, characters, vowels
total_lines = len(lines)
total_words = len(content.split())
total_characters = len(content)
total_vowels = sum(1 for ch in content.lower() if ch in "aeiou")

# Extract log levels using regex
levels = re.findall(r"\[(INFO|WARNING|ERROR|CRITICAL)\]", content)

info_count = levels.count("INFO")
warning_count = levels.count("WARNING")
error_count = levels.count("ERROR")
critical_count = levels.count("CRITICAL")

# Find ERROR and CRITICAL lines
alerts = []
for line in lines:
    if re.search(r"\[(ERROR|CRITICAL)\]", line):
        alerts.append(line.strip())

# Display results
print("Total Lines :", total_lines)
print("Total Words :", total_words)
print("Total Characters :", total_characters)
print("Total Vowels :", total_vowels)
print(f"INFO:{info_count} WARNING:{warning_count} ERROR:{error_count} CRITICAL:{critical_count}")

print("\n--- ALERTS ---")
for alert in alerts:
    print(alert)

# Write results to report file
with open("log_report.txt", "w") as report:
    report.write(f"Total Lines : {total_lines}\n")
    report.write(f"Total Words : {total_words}\n")
    report.write(f"Total Characters : {total_characters}\n")
    report.write(f"Total Vowels : {total_vowels}\n")
    report.write(f"INFO:{info_count} WARNING:{warning_count} ERROR:{error_count} CRITICAL:{critical_count}\n")
    report.write("\n--- ALERTS ---\n")

    for alert in alerts:
        report.write(alert + "\n")


