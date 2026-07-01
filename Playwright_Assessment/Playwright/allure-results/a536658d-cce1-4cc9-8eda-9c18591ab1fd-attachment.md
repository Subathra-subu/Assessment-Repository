# Instructions

- Following Playwright test failed.
- Explain why, be concise, respect Playwright best practices.
- Provide a snippet of code with the fix, if possible.

# Test info

- Name: PlaywrightCommands.test.ts >> Commands test
- Location: tests\PlaywrightCommands.test.ts:5:5

# Error details

```
Error: expect(page).toHaveTitle(expected) failed

Expected: "Playwright"
Received: "playwright - Search"

Call log:
  - Expect "toHaveTitle" with timeout 5000ms
    5 × unexpected value "playwright - Search"

```

```yaml
- banner:
  - button "Skip to content"
  - button "Accessibility Feedback"
  - link "Back to Bing search":
    - /url: /?FORM=Z9FD1
    - heading "Back to Bing search" [level=1]
  - search:
    - button "Search"
    - searchbox "Enter your search here - Search suggestions will show as you type": playwright
    - button "Search using an image"
  - complementary "Account Rewards and Preferences":
    - button "Microsoft Rewards":
      - text: Rewards
      - img
    - link "Sign in":
      - /url: javascript:void(0)
  - navigation "Search Filter":
    - list:
      - listitem:
        - link "All":
          - /url: /?scope=web&FORM=HDRSC1
      - listitem:
        - link "Search":
          - /url: /copilotsearch?q=playwright&FORM=CSSCOP
          - img
          - text: Search
      - listitem:
        - link "Images":
          - /url: https://www.bing.com/ck/a?!&&p=e3873fc1e9f287537e127da6b168431529df373bf35a8f3cf5053923fa06e0ccJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2ltYWdlcy9zZWFyY2g_cT1wbGF5d3JpZ2h0JkZPUk09SERSU0Mz&ntb=1
      - listitem:
        - link "Videos":
          - /url: https://www.bing.com/ck/a?!&&p=3568ef21de0796102cf88a2b8de9ef276861503e8707ff90c4b385bd3014913aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1wbGF5d3JpZ2h0JkZPUk09SERSU0M0&ntb=1
      - listitem:
        - link "Maps":
          - /url: https://www.bing.com/ck/a?!&&p=fd447198a4e77090129b43f30f2420bb1bcaa55d389c0e2e81676b3b51fbde1aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L21hcHM_cT1wbGF5d3JpZ2h0JkZPUk09SERSU0M2&ntb=1
      - listitem:
        - link "News":
          - /url: https://www.bing.com/ck/a?!&&p=1d05cd67d11cc70d631325875ddf2daed21bc2536eeaa664ffb5d5be930ecccbJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L25ld3Mvc2VhcmNoP3E9cGxheXdyaWdodCZGT1JNPUhEUlNDNw&ntb=1
      - listitem:
        - link "Copilot":
          - /url: https://www.bing.com/ck/a?!&&p=3e6673b15e638746e3eb66b866eca1da80db866910c8c160dfc1d912316589e6JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2NoYXQ_cHJvbXB0PXBsYXl3cmlnaHQmc2VuZHF1ZXJ5PTEmRk9STT1TQ0NPRFg&ntb=1
      - listitem:
        - button "More":
          - img
          - text: More
- main "Search Results":
  - list:
    - listitem:
      - region "Copilot Search":
        - heading "Playwright" [level=2]
        - text: End-to-end testing framework
        - tablist "Playwright End-to-end testing framework":
          - tab "Overview" [selected]
          - tab "Features"
          - tab "Usage"
          - tab "Configuration"
        - list:
          - listitem:
            - list:
              - listitem:
                - 'link "GitHub - microsoft/playwright: Playwright is a framework for Web ..."':
                  - /url: /images/search?view=detailV2&ccid=no%2bd95uH&id=C57ED6BF45D90ABECAB63BBA7E313456E659C2FC&thid=OIP.no-d95uHh8_Vu67iGJ52ugHaDt&mediaurl=https%3a%2f%2frepository-images.githubusercontent.com%2f221981891%2f8c5c6942-c91f-4df1-825f-4cf474056bd7&exph=640&expw=1280&q=playwright&mode=overlay&FORM=IQFRBA&selectedIndex=0&idpp=serp
              - listitem:
                - 'link "#16: Test Automation with Playwright | Azure Static Web Apps"':
                  - /url: /images/search?view=detailV2&ccid=KjTuuKME&id=6AC38965CA6680A874F0D0E121E0D5C9E473B041&thid=OIP.KjTuuKMEcDo5KnLW50o6tAHaEK&mediaurl=https%3a%2f%2fwww.azurestaticwebapps.dev%2fassets%2fimages%2f16-playwright-564feddda5d05dfe978b479e64bed2f2.jpg&exph=2160&expw=3840&q=playwright&mode=overlay&FORM=IQFRBA&selectedIndex=0&idpp=serp
            - link "All images":
              - /url: https://www.bing.com/ck/a?!&&p=0cce733ec86d93dae7c416db15eaefc697726dadfd9da638c5ace0f6b3e64ce2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2ltYWdlcy9zZWFyY2g_cT1QbGF5d3JpZ2h0JkZPUk09SUFDRlNN&ntb=1
            - link "Playwright":
              - /url: https://www.bing.com/ck/a?!&&p=bcd2aeba8986067024661ac9b09fd13398718a03e06a5a1486353dcd38a86f49JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9wbGF5d3JpZ2h0LmRldi8&ntb=1
              - img "Global web icon"
              - text: Playwright https://
              - strong: playwright
              - text: .dev
            - heading "Fast and reliable end-to-end testing for modern web apps | Playwright" [level=2]:
              - link "Fast and reliable end-to-end testing for modern web apps | Playwright":
                - /url: https://www.bing.com/ck/a?!&&p=bcd2aeba8986067024661ac9b09fd13398718a03e06a5a1486353dcd38a86f49JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9wbGF5d3JpZ2h0LmRldi8&ntb=1
            - list:
              - listitem:
                - contentinfo:
                  - link "Playwright enables reliable web automation for testing, scripting, and AI agents. One API to drive Chromium, Firefox, and WebKit — in your tests, your scripts, and your agent workflows. Available for TypeScript, Python, .NET, and Java.":
                    - /url: https://www.bing.com/ck/a?!&&p=bcd2aeba8986067024661ac9b09fd13398718a03e06a5a1486353dcd38a86f49JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9wbGF5d3JpZ2h0LmRldi8&ntb=1
                    - strong: Playwright
                    - text: enables reliable web automation for testing, scripting, and AI agents. One API to drive Chromium, Firefox, and WebKit — in your tests, your scripts, and your agent workflows. Available for TypeScript, Python, .NET, and Java.
          - listitem:
            - list:
              - listitem:
                - link "Developer":
                  - /url: https://www.bing.com/ck/a?!&&p=c29d515f79d45e3af9db77b79558342f4e522fe881125873b62b3cab7a939fbfJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPVBsYXl3cmlnaHQrZGV2ZWxvcGVyJmZpbHRlcnM9c2lkOiJlMGZiZGVjNi05NDY2LTU2OGYtYmRiMy05ZWFjYmExNDFkNTAi&ntb=1
                - heading "Developer" [level=2]
                - link "Microsoft":
                  - /url: https://www.bing.com/ck/a?!&&p=709cedb1777ed31d220745508d3a12953f9c9cc853c12ac88cbd960e0861ac48JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPU1pY3Jvc29mdCZmaWx0ZXJzPXNpZDoiYTA5M2U5YjktOTBmNS1hM2Q1LWM0YjgtNTg1NWUxYjAxZjg1Ig&ntb=1
              - listitem:
                - heading "Stable release" [level=2]
                - text: 1.61.1 / 23 June 2026
              - listitem:
                - link "Written in":
                  - /url: https://www.bing.com/ck/a?!&&p=895bb2b2da8962ea6abe682c9d73cc16cd68848a9c4c596dcf468f4b691a26caJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPVBsYXl3cmlnaHQrd3JpdHRlbitpbiZmaWx0ZXJzPXNpZDoiZTBmYmRlYzYtOTQ2Ni01NjhmLWJkYjMtOWVhY2JhMTQxZDUwIg&ntb=1
                - heading "Written in" [level=2]
                - link "TypeScript":
                  - /url: https://www.bing.com/ck/a?!&&p=9681add3e65c23fd1eb2bfd7dbb7d758f97aaa01e2e0cb093e9f6111691a9edcJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPVR5cGVTY3JpcHQmZmlsdGVycz1zaWQ6IjBiYjEwNzFhLWFiNDAtNGY4My04NWExLTJjNDhkNDQ4YTMxNyI&ntb=1
              - listitem:
                - link "Operating system":
                  - /url: https://www.bing.com/ck/a?!&&p=0fee18ce8b331c12c1dde1471d8384127ae2cd69b48b6a739717e9288fed09e0JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPVBsYXl3cmlnaHQrb3BlcmF0aW5nK3N5c3RlbSZmaWx0ZXJzPXNpZDoiZTBmYmRlYzYtOTQ2Ni01NjhmLWJkYjMtOWVhY2JhMTQxZDUwIg&ntb=1
                - heading "Operating system" [level=2]
                - link "Microsoft Windows":
                  - /url: https://www.bing.com/ck/a?!&&p=e1e93a8e3ae97d7918d4a436aa4ce8cc25ddbbba320c6c62682347387450d7a1JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPU1pY3Jvc29mdCtXaW5kb3dzJmZpbHRlcnM9c2lkOiIxNmFlYjZkOS05MDk4LTBhNDAtNDk3MC04ZTQ2YTRmY2VlMTIi&ntb=1
                - text: ","
                - link "macOS":
                  - /url: https://www.bing.com/ck/a?!&&p=8749835435680420f41218d8118e91db324ab8cd4355db5df14da535eb5a7b5dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPW1hY09TJmZpbHRlcnM9c2lkOiJhMGQyNjhlZi04MGRjLTczZTQtOWZmOS05OGIzYTIzMzIxOGEi&ntb=1
                - text: ","
                - link "Linux":
                  - /url: https://www.bing.com/ck/a?!&&p=a12a0f04216b36d32167496eeeca2d25dafcc5bba5bc7ee1fe4354a5e1de5c0cJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9GT1JNPVNOQVBTVCZxPUxpbnV4JmZpbHRlcnM9c2lkOiJkMmY0ZTkzMy1iZmFkLWYxODQtZmNmNC0yMDA0MmU0YmVkMzYi&ntb=1
            - list:
              - listitem:
                - link "How to use Playwright selectors":
                  - /url: /images/search?view=detailV2&ccid=5cAujqBH&id=9D447DCFB460A7986598BC2D8E9560F49DC49983&thid=OIP.5cAujqBHv6AOYO8_ZerppgHaE7&mediaurl=https%3a%2f%2fblog.apify.com%2fcontent%2fimages%2f2023%2f09%2fPlaywright-selectors-1.jpg&exph=1333&expw=2000&q=playwright&mode=overlay&FORM=IQFRBA&selectedIndex=0&idpp=serp
            - link "All images":
              - /url: https://www.bing.com/ck/a?!&&p=0cce733ec86d93dae7c416db15eaefc697726dadfd9da638c5ace0f6b3e64ce2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2ltYWdlcy9zZWFyY2g_cT1QbGF5d3JpZ2h0JkZPUk09SUFDRlNN&ntb=1
          - listitem:
            - 'link "Get Started with Playwright and VS Code (2025 edition) from YouTube · Duration: 19 minutes 46 seconds · 80.5K views · uploaded on 11 months ago · uploaded by Playwright · Click to play."':
              - /url: https://www.bing.com/ck/a?!&&p=6780094994ffab703f6cb64cb9610daee49a2dfbdd2b0c0b0cd5991fa008bd05JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9cGxheXdyaWdodCYmbWlkPUU0MkI3REYwREZGRTdBRDA4NkY0RTQyQjdERjBERkZFN0FEMDg2RjQmY2h1cmw9aHR0cHMlM2ElMmYlMmZ3d3cueW91dHViZS5jb20lMmZjaGFubmVsJTJmVUM0NlpqOHBESDV0RG9zcW0xZ2Q3V1RnJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQU1HWkM&ntb=1
              - img "Get Started with Playwright and VS Code (2025 edition)"
              - text: 19:46 Get Started with Playwright and VS Code (2025 edition) YouTube › Playwright · 80.5K views · 11 months ago
            - 'link "GitHub - microsoft/playwright: Playwright is a framework for Web ..."':
              - /url: https://www.bing.com/ck/a?!&&p=be78972121b7b04e01dda6e9e487557dbe42b3271912c6cfdf95b2eac9277b9dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9naXRodWIuY29tL21pY3Jvc29mdC9wbGF5d3JpZ2h0&ntb=1
            - 'heading "GitHub - microsoft/playwright: Playwright is a framework for Web ..." [level=2]'
            - paragraph:
              - strong: Playwright
              - text: is a framework for web automation and testing. It drives Chromium, Firefox, and WebKit with a single API — in your tests, in your scripts, and as a tool fo…
            - img "Global Web Icon"
            - text: Github
      - list "Please use arrow keys to navigate":
        - listitem:
          - link "Playwright vs Selenium":
            - /url: https://www.bing.com/ck/a?!&&p=bc16ca45ca73113f812130dfef86d8984734c8b13d7f9143ced5df9cce5222c6JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2NvcGlsb3RzZWFyY2g_cT1QbGF5d3JpZ2h0K3ZzK1NlbGVuaXVtJmZvcm09Q1NTQU5T&ntb=1
        - listitem:
          - link "Playwright VS Cypress":
            - /url: https://www.bing.com/ck/a?!&&p=fc7397c839457723d73ab9f53cd7418e22c46f31fad5c5ebc18d50cd6b34b65eJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2NvcGlsb3RzZWFyY2g_cT1QbGF5d3JpZ2h0K1ZTK0N5cHJlc3MmZm9ybT1DU1NBTlM&ntb=1
        - listitem:
          - link "Playwright VS Puppeteer":
            - /url: https://www.bing.com/ck/a?!&&p=8cb845db3fbde51eec6db2337ce39124032cb7a94ef9a5d77befd7c09519d9b7JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L2NvcGlsb3RzZWFyY2g_cT1QbGF5d3JpZ2h0K1ZTK1B1cHBldGVlciZmb3JtPUNTU0FOUw&ntb=1
  - list:
    - listitem:
      - heading "Videos of Playwright" [level=2]:
        - link "Videos of Playwright":
          - /url: https://www.bing.com/ck/a?!&&p=2370b14c75b6d7aa3922408a2b77a1a492eeef5b71bd351ff1c9adf3b917b894JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1wbGF5d3JpZ2h0JnFwdnQ9cGxheXdyaWdodCZGT1JNPVZEUkU&ntb=1
      - list "Please use arrow keys to navigate":
        - listitem:
          - link "What Is Playwright":
            - /url: https://www.bing.com/ck/a?!&&p=1d6c58fd039a7594ec8e4eaba26e5f515c0d4dcf7e674d15b94998659c582ebfJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1XaGF0K0lzK1BsYXl3cmlnaHQmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Test":
            - /url: https://www.bing.com/ck/a?!&&p=15eafa0a6e18bf9a02c715c250cce82592968952b321b0e72fab6f3c7798bb0dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K1Rlc3QmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Documentation":
            - /url: https://www.bing.com/ck/a?!&&p=0022eba1dc100a07942a0400e80e72e4ad016cc0cd447369a17f1fb37bb2b62eJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0RvY3VtZW50YXRpb24mJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Installation":
            - /url: https://www.bing.com/ck/a?!&&p=8883a00f6d916f3c0b0edf8dcf9ae0102a53dac7b718db9cf6d97b8140aa0f62JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0luc3RhbGxhdGlvbiYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwright Demo":
            - /url: https://www.bing.com/ck/a?!&&p=b916c74c2b7e444aee7a409ea624c8d629c956219d72b1b2df2f8c083db2004cJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0RlbW8mJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Package Guide Python":
            - /url: https://www.bing.com/ck/a?!&&p=e73372a0ad4506f24d35df43947816ef285ced757a23a2aca1739541319f459aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K1BhY2thZ2UrR3VpZGUrUHl0aG9uJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Playwright Features":
            - /url: https://www.bing.com/ck/a?!&&p=d5826f864155943182cd55eb394584bf846b2990258d973adb9d89b4211d8c62JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0ZlYXR1cmVzJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Playwright Interview Questions":
            - /url: https://www.bing.com/ck/a?!&&p=5d0bcfa58c0968138a2e3fb807fa4c461cf658463cc5c7d53128886492730d14JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0ludGVydmlldytRdWVzdGlvbnMmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Automation":
            - /url: https://www.bing.com/ck/a?!&&p=494ba06445c33f11a9c6962faaf1a32698efca2ad8f98564f7f0ab5675c3949fJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0F1dG9tYXRpb24mJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright Tutorial":
            - /url: https://www.bing.com/ck/a?!&&p=173b6371a839440cf5b90b5f560748dc5ad19917509d70fe43aecd98bd6bbfe4JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K1R1dG9yaWFsJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Playwright Automation Tool":
            - /url: https://www.bing.com/ck/a?!&&p=9e9d4e6b3125a986fbaf2c8659786d2f356b5a75c807cd3f6d57ac2472a59ec7JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0F1dG9tYXRpb24rVG9vbCYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Jest":
            - /url: https://www.bing.com/ck/a?!&&p=1132a3e6a0d86c0b4aa9e8120f6d48da78de04d7c76603d91cac143f6864544bJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1KZXN0JiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Microsoft Playwright":
            - /url: https://www.bing.com/ck/a?!&&p=551784f4c0562e7c40f2d12e794ef26ac6378673a3f3228df3f630579363258dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1NaWNyb3NvZnQrUGxheXdyaWdodCYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwrite Basics in Python Tamil":
            - /url: https://www.bing.com/ck/a?!&&p=be322f310d4e3b55265abaeda910c90037ee06c922adee77a61d33bc024c3b91JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpdGUrQmFzaWNzK2luK1B5dGhvbitUYW1pbCYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Cypress":
            - /url: https://www.bing.com/ck/a?!&&p=b9c097ff23ecbdbc961d6989713bfaa62c2ce478708c324d230b2a09b178ccfbJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1DeXByZXNzJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Python Record and Play Actions":
            - /url: https://www.bing.com/ck/a?!&&p=4db2d42b4c438f3d04042f2e8cc0da760065ea39a2331fb9297469d8e0e5e3a1JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QeXRob24rUmVjb3JkK2FuZCtQbGF5K0FjdGlvbnMmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Automation":
            - /url: https://www.bing.com/ck/a?!&&p=39dcdcd7555e5e54abd7d0a3c60f4fa8fd6a63ff2d2938b6794bced54efcfc10JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BdXRvbWF0aW9uJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "American Playwright":
            - /url: https://www.bing.com/ck/a?!&&p=8f0803cb4368c61c321a8c1da97b98abe41e0f15b193584ef5a25b3490bb1521JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BbWVyaWNhbitQbGF5d3JpZ2h0JiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Mocha":
            - /url: https://www.bing.com/ck/a?!&&p=c094292237990460e2bd0f27d203dab544a2c6a02758cef31b6dc29e806614ddJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1Nb2NoYSYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwright Examples":
            - /url: https://www.bing.com/ck/a?!&&p=9dd498dabd9e4fb7ea18a308ad5a2a59af2a4be42386d08573919fab91ef32ccJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K0V4YW1wbGVzJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Playwright with Python Tutorial in Vc":
            - /url: https://www.bing.com/ck/a?!&&p=57575beda66ac4ddaca4fe96b90af8ba8307acde75d103897b287bc92c0add2cJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K3dpdGgrUHl0aG9uK1R1dG9yaWFsK2luK1ZjJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Playwright Microsoft Testing Tutorial":
            - /url: https://www.bing.com/ck/a?!&&p=4abb7738710f314af36a1579d213df6d47a0d46586048a64d2b0a97e36cd97f4JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K01pY3Jvc29mdCtUZXN0aW5nK1R1dG9yaWFsJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Raghav Playwright":
            - /url: https://www.bing.com/ck/a?!&&p=94797b015bc38b7604692cb10e3eeac4e72d6b3d88d97aa07a49d4325f971375JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1SYWdoYXYrUGxheXdyaWdodCYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwright Test Automation":
            - /url: https://www.bing.com/ck/a?!&&p=1c2bc02e96f4ad4f0431db4fe2f3e729dbf10eb4be9e2792699d6e81de5d1addJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K1Rlc3QrQXV0b21hdGlvbiYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwright with Ai":
            - /url: https://www.bing.com/ck/a?!&&p=2c9c77a3e11ccdcb76063f034a1a0c725cc956c6a36151087740532f503c2debJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K3dpdGgrQWkmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Platwright Framework in Tamil":
            - /url: https://www.bing.com/ck/a?!&&p=422089766f1dfd78196eeeb568e3554f656ba376b53c1695356e44fdbbeb7f33JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF0d3JpZ2h0K0ZyYW1ld29yaytpbitUYW1pbCYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Best Plays by Playwrights":
            - /url: https://www.bing.com/ck/a?!&&p=f47526e62a28b28b85bf84978bfa415e041e186c5e6efe402d8453d425422bdcJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1CZXN0K1BsYXlzK2J5K1BsYXl3cmlnaHRzJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Famous Playwrights":
            - /url: https://www.bing.com/ck/a?!&&p=3148e28beaa4de5dbd0e4b4ebb00da351def24a1c86f79725952cf40f030ae8eJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1GYW1vdXMrUGxheXdyaWdodHMmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Edward Albee":
            - /url: https://www.bing.com/ck/a?!&&p=d6bbd9922e4c92e15e272ddc7c66819e4c5479cbab292097211541fc13590a82JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1FZHdhcmQrQWxiZWUmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Python for Playwright":
            - /url: https://www.bing.com/ck/a?!&&p=449507bcd61eed9a3e91494d574195a5ea41a44efc14e99e40ec1bfd6f755557JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QeXRob24rZm9yK1BsYXl3cmlnaHQmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Constantin Stanislavski":
            - /url: https://www.bing.com/ck/a?!&&p=130eff14dbd93e6b4ed6cfcccc6599ff59bb944f93c9d4fbc33ac112a1d25397JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1Db25zdGFudGluK1N0YW5pc2xhdnNraSYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Edward Albee Plays":
            - /url: https://www.bing.com/ck/a?!&&p=8f39abe3cdf7fb27e0bd18267fc363ba8cd3ab4fcf7ea17464c478e565e7d7bcJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1FZHdhcmQrQWxiZWUrUGxheXMmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Costume Design":
            - /url: https://www.bing.com/ck/a?!&&p=b3a71d37fe5405ef62cbfdcb6ecc24c0e1701e1daa6abb997102d89f8dd94bc4JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1Db3N0dW1lK0Rlc2lnbiYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Elizabethan-era":
            - /url: https://www.bing.com/ck/a?!&&p=531dd94e1a72967c0b7c403bf013666fa4a14e1aa80071f82e975d6c9667f66cJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1FbGl6YWJldGhhbi1lcmEmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Playwright in 1 Hour":
            - /url: https://www.bing.com/ck/a?!&&p=aa75455826c094a0b8ee1aa8d1e556740d20229137248b85726625f1c46c3be2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K2luKzErSG91ciYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Dennis Potter":
            - /url: https://www.bing.com/ck/a?!&&p=56636078e5e464f08a6478c1c1d00a2cffa925146c965507e0817dbee714803fJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1EZW5uaXMrUG90dGVyJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Describing a Place":
            - /url: https://www.bing.com/ck/a?!&&p=73bbc0aaa9d9413b96dbde0f1848bace3a9d56f4a29f103820300de6db70c12aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1EZXNjcmliaW5nK2ErUGxhY2UmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Dario Fo":
            - /url: https://www.bing.com/ck/a?!&&p=41093a5c0857092f12c913746a1cf2e29aec92c17ae643a05a5dd83186377c5eJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1EYXJpbytGbyYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "August Wilson":
            - /url: https://www.bing.com/ck/a?!&&p=8e88651dee1088e5fa6edefbe5be5a6016c941876e23d106fcc2cb9b1a1142c2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BdWd1c3QrV2lsc29uJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Famous Playwrights of All Time":
            - /url: https://www.bing.com/ck/a?!&&p=a700e5aed0bcdcde9b030e10ed34c3dd58f42c488920c97440b6bba9fd63589bJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1GYW1vdXMrUGxheXdyaWdodHMrb2YrQWxsK1RpbWUmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Ancient Greek Playwrights":
            - /url: https://www.bing.com/ck/a?!&&p=d83b105397ce3061ed5aaaab759e7b82791aa45591aa8e3ab1788128f6e8879fJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BbmNpZW50K0dyZWVrK1BsYXl3cmlnaHRzJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Arthur Miller":
            - /url: https://www.bing.com/ck/a?!&&p=5dcc6b63e23ee927134f7fe67c390261532fc9d97ccc30839b1bb1fe0b89c87aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BcnRodXIrTWlsbGVyJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Death of Julius Caesar":
            - /url: https://www.bing.com/ck/a?!&&p=43ed5661a00de3ac566a1975172185e2af71b229090fa0a4e8f758d5878dfa4aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1EZWF0aCtvZitKdWxpdXMrQ2Flc2FyJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "Artistic Director":
            - /url: https://www.bing.com/ck/a?!&&p=9cd393667b4008ec1b70ab0712163a2eaa0148edef57d64251d5da953b81c9eeJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1BcnRpc3RpYytEaXJlY3RvciYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Biography of William Shakespeare":
            - /url: https://www.bing.com/ck/a?!&&p=ae867592fd90b5c723d4aaef984ed0b5f9e88ce0dc5352220023ffa8a6d8b383JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1CaW9ncmFwaHkrb2YrV2lsbGlhbStTaGFrZXNwZWFyZSYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Edward O. Wilson":
            - /url: https://www.bing.com/ck/a?!&&p=b88bb610ee9949eae0a85d773f0ce394c8e107e16a7115449df129fad053e8ddJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1FZHdhcmQrTy4rV2lsc29uJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
        - listitem:
          - link "David Henry Hwang":
            - /url: https://www.bing.com/ck/a?!&&p=57c0bda1b91063ce3c4ffa111f9f644a0618641c8d2a129a7eb655d5fe2bf81dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1EYXZpZCtIZW5yeStId2FuZyYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Writing a Play":
            - /url: https://www.bing.com/ck/a?!&&p=235dcbe1ecc2413b3de97ef87a1d084da8968eb4c81a046952a312ddcad53645JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1Xcml0aW5nK2ErUGxheSYmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZBUlNRUA&ntb=1
        - listitem:
          - link "Playwright Tool":
            - /url: https://www.bing.com/ck/a?!&&p=62084f16c6b85dea67d4cf4d9d15a3c2ff8f51589253e0ccb54f781b3aefb562JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1QbGF5d3JpZ2h0K1Rvb2wmJm1jaWQ9RkM2MEE5NzI1RDY2NDYxMTgxRjcxNjM1QjQyQzRCQjAmRk9STT1WQVJTUVA&ntb=1
        - listitem:
          - link "Jackie Wilson":
            - /url: https://www.bing.com/ck/a?!&&p=291ad33a685825419c8a8a5dd52fd635b9fd7f0d554ba2229c37279f45278b63JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9zZWFyY2g_cT1KYWNraWUrV2lsc29uJiZtY2lkPUZDNjBBOTcyNUQ2NjQ2MTE4MUY3MTYzNUI0MkM0QkIwJkZPUk09VkFSU1FQ&ntb=1
      - 'link "Software Testing Course – Playwright, E2E, and AI Agents from YouTube · Duration: 1 hour 3 minutes 31 seconds · 79.4K views · uploaded on 3 months ago · uploaded by freeCodeCamp.org · Click to play. · Learn the essentials of software testing, from fundamental concepts like the testing pyramid to hands-on automation using Playwright. You will explore real-world case studies of software failures and learn advanced techniques such as mocking, edge case testing, and accessibility. Finally, discover how AI-powered tools like Kane AI are enabling ..."':
        - /url: https://www.bing.com/ck/a?!&&p=dfaf71d050329b0edbe5c0b55ef612a106c96194129529b2570a97e78c257d6eJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9cGxheXdyaWdodCZtaWQ9REI4RjhGOTgzNUQ4QUVBQTE0MzFEQjhGOEY5ODM1RDhBRUFBMTQzMSZjaHVybD1odHRwcyUzYSUyZiUyZnd3dy55b3V0dWJlLmNvbSUyZmNoYW5uZWwlMmZVQzhidXRJU0Z3VC1XbDdFVjBoVUswQlEmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZJUkU&ntb=1
        - img "Software Testing Course – Playwright, E2E, and AI Agents"
        - text: 1:03:31 Software Testing Course –
        - strong: Playwright
        - text: ", E2E, and AI Agents"
        - img "Video source site"
        - text: YouTube · freeCodeCamp.org 79.4K views · 3 months ago
      - 'link "Giving UI Reviews to Coding Agents - Playwright CLI from YouTube · Duration: 1 minutes 40 seconds · 7.5K views · uploaded on 2 months ago · uploaded by Playwright · Click to play. · 🔗 Get started: https://github.com/microsoft/playwright-cli 📚 Docs: https://playwright.dev/agent-cli/introduction New Playwright features make it easier to collaborate with coding agents like Copilot CLI and Claude Code. In this video, I show how to give visual feedback on your agent''s work using the Playwright Dashboard — sketch ..."':
        - /url: https://www.bing.com/ck/a?!&&p=0816d07f45c848823deecca0c9272930a9298264a4f595b5eab5992f0c228e81JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9cGxheXdyaWdodCZtaWQ9ODQxQUM1MDgwNkQ2NEJBOThBMTc4NDFBQzUwODA2RDY0QkE5OEExNyZjaHVybD1odHRwcyUzYSUyZiUyZnd3dy55b3V0dWJlLmNvbSUyZmNoYW5uZWwlMmZVQzQ2Wmo4cERINXREb3NxbTFnZDdXVGcmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZJUkU&ntb=1
        - img "Giving UI Reviews to Coding Agents - Playwright CLI"
        - text: 1:40 Giving UI Reviews to Coding Agents -
        - strong: Playwright
        - text: CLI
        - img "Video source site"
        - text: YouTube · Playwright 7.5K views · 2 months ago
      - 'link "Playwright Fixtures Explained 🔥 | Step-by-Step Tutorial for Beginners from YouTube · Duration: 10 minutes 34 seconds · 14.5K views · uploaded on 3 months ago · uploaded by Automation Step by Step · Click to play. · In this Playwright tutorial, we learn Fixtures from scratch with a beginner-friendly explanation and hands-on demo. Fixtures are setups prepared in advance that tests can use when needed. Fixtures are one of the most powerful features in Playwright that allow us to prepare reusable setups before tests run. They help reduce duplicate code and ..."':
        - /url: https://www.bing.com/ck/a?!&&p=0e1c3770721e79a409a366b6624f42177de2dc61b2fd7bc3edca931bba6ef907JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3ZpZGVvcy9yaXZlcnZpZXcvcmVsYXRlZHZpZGVvP3E9cGxheXdyaWdodCZtaWQ9REJBQ0U2RUQxQUJCRTM5QzVBRjVEQkFDRTZFRDFBQkJFMzlDNUFGNSZjaHVybD1odHRwcyUzYSUyZiUyZnd3dy55b3V0dWJlLmNvbSUyZmNoYW5uZWwlMmZVQ1R0N3B5WS1vMGVsdHExNGdsYUc1ZGcmbWNpZD1GQzYwQTk3MjVENjY0NjExODFGNzE2MzVCNDJDNEJCMCZGT1JNPVZJUkU&ntb=1
        - img "Playwright Fixtures Explained 🔥 | Step-by-Step Tutorial for Beginners"
        - text: 10:34
        - strong: Playwright
        - text: Fixtures Explained 🔥 | Step-by-Step Tutorial for Beginners
        - img "Video source site"
        - text: YouTube · Automation Step by Step 14.5K views · 3 months ago
    - listitem:
      - link "Github":
        - /url: https://www.bing.com/ck/a?!&&p=be78972121b7b04e01dda6e9e487557dbe42b3271912c6cfdf95b2eac9277b9dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9naXRodWIuY29tL21pY3Jvc29mdC9wbGF5d3JpZ2h0&ntb=1
        - img "Global web icon"
        - text: Github https://
        - strong: github.com
        - text: › microsoft ›
        - strong: playwright
      - 'heading "GitHub - microsoft/playwright: Playwright is a framework for Web ..." [level=2]':
        - 'link "GitHub - microsoft/playwright: Playwright is a framework for Web ..."':
          - /url: https://www.bing.com/ck/a?!&&p=be78972121b7b04e01dda6e9e487557dbe42b3271912c6cfdf95b2eac9277b9dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9naXRodWIuY29tL21pY3Jvc29mdC9wbGF5d3JpZ2h0&ntb=1
      - img
      - tablist:
        - tab "Documentation | API reference" [selected]
        - tab "Installation"
        - tab "Capabilities"
        - tab "Examples"
        - tab "Resources"
      - img
      - tabpanel "Documentation | API reference":
        - list:
          - listitem: Playwright is a framework for Web Testing and Automation. It allows testing Chromium, Firefox and W… Headless execution is supported for all browsers on all platforms. Check out system requirements for details.
        - link "See more on github.com":
          - /url: https://www.bing.com/ck/a?!&&p=be78972121b7b04e01dda6e9e487557dbe42b3271912c6cfdf95b2eac9277b9dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9naXRodWIuY29tL21pY3Jvc29mdC9wbGF5d3JpZ2h0&ntb=1
    - listitem:
      - link "Explore this image":
        - /url: /images/search?view=detailV2&ccid=TcheT2ux&id=0FA5098B8BCEF95D2B060218D8CE7BCA61E87291&thid=OIP.TcheT2uxv2Ap7YV9IU6VAwAAAA&mediaurl=https://devblogs.microsoft.com/wp-content/uploads/2025/08/The-Complete-Playwright-end-to-end-story.png&q=playwright&ck=1C37E0B12EA953D7E51E8327FD2B50C6&idpp=rc&expw=474&exph=266&form=rc2idp
      - link "Microsoft Developer":
        - /url: https://www.bing.com/ck/a?!&&p=a130a7852f9e09ef3f47a1b7980f0bceeac61c6cc7b5d9b3d32d8edfa0c08058JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9kZXZlbG9wZXIubWljcm9zb2Z0LmNvbS9ibG9nL3RoZS1jb21wbGV0ZS1wbGF5d3JpZ2h0LWVuZC10by1lbmQtc3RvcnktdG9vbHMtYWktYW5kLXJlYWwtd29ybGQtd29ya2Zsb3dz&ntb=1
        - img "Global web icon"
        - text: Microsoft Developer https://developer.microsoft.com › blog › the-complete-
        - strong: playw
        - text: …
      - heading "The Complete Playwright End-to-End Story, Tools, AI, …" [level=2]:
        - link "The Complete Playwright End-to-End Story, Tools, AI, …":
          - /url: https://www.bing.com/ck/a?!&&p=a130a7852f9e09ef3f47a1b7980f0bceeac61c6cc7b5d9b3d32d8edfa0c08058JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9kZXZlbG9wZXIubWljcm9zb2Z0LmNvbS9ibG9nL3RoZS1jb21wbGV0ZS1wbGF5d3JpZ2h0LWVuZC10by1lbmQtc3RvcnktdG9vbHMtYWktYW5kLXJlYWwtd29ybGQtd29ya2Zsb3dz&ntb=1
      - paragraph: Aug 7, 2025 · Playwright offers a full ecosystem empowering developers to write, debug, and maintain tests with speed and reliability. From its powerful test …
    - listitem:
      - link "Wikipedia":
        - /url: https://www.bing.com/ck/a?!&&p=5d738f498fb40cc9942bb8b5a2efe17f697a24109841bd10ca6f3c680f3a1561JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvUGxheXdyaWdodF8oc29mdHdhcmUp&ntb=1
        - img "Global web icon"
        - text: Wikipedia https://
        - strong: en.wikipedia.org
        - text: › wiki ›
        - strong: Playwright
        - text: _(software)
      - heading "Playwright (software) - Wikipedia" [level=2]:
        - link "Playwright (software) - Wikipedia":
          - /url: https://www.bing.com/ck/a?!&&p=5d738f498fb40cc9942bb8b5a2efe17f697a24109841bd10ca6f3c680f3a1561JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly9lbi53aWtpcGVkaWEub3JnL3dpa2kvUGxheXdyaWdodF8oc29mdHdhcmUp&ntb=1
      - paragraph: Playwright is an open-source automation library for browser testing and web scraping [3] developed by Microsoft [4][5] and launched on 31 January 2020, which has since become popular among …
    - listitem:
      - link "Explore this image":
        - /url: /images/search?view=detailV2&ccid=xNZ2XTYG&id=A51C962924972FE04858E13A964BC6128349EF83&thid=OIP.xNZ2XTYGcl1hFcl6CrJLxQHaGs&mediaurl=https://browserstack.wpenginepowered.com/wp-content/uploads/2022/05/Guide-42.png&q=playwright&ck=16C24F4475701A5AE7E4AF1F744F3945&idpp=rc&expw=1160&exph=1048&form=rc2idp
      - link "BrowserStack":
        - /url: https://www.bing.com/ck/a?!&&p=3b1193d2dfad57b2012b985bf816078a5f5f104611c90a5475ce80599d9b5f81JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cuYnJvd3NlcnN0YWNrLmNvbS9ndWlkZS9wbGF5d3JpZ2h0LXR1dG9yaWFs&ntb=1
        - img "Global web icon"
        - text: BrowserStack https://www.browserstack.com › guide ›
        - strong: playwright
        - text: "-tutorial"
      - 'heading "Playwright Automation Framework: Tutorial [2026]" [level=2]':
        - 'link "Playwright Automation Framework: Tutorial [2026]"':
          - /url: https://www.bing.com/ck/a?!&&p=3b1193d2dfad57b2012b985bf816078a5f5f104611c90a5475ce80599d9b5f81JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cuYnJvd3NlcnN0YWNrLmNvbS9ndWlkZS9wbGF5d3JpZ2h0LXR1dG9yaWFs&ntb=1
      - paragraph: Jan 16, 2026 · Learn how to write and run Playwright tests with locators, debugging, and best practices. Build stable, scalable test automation with real examples. …
    - listitem:
      - link "Explore this image":
        - /url: /images/search?view=detailV2&ccid=Ge9bbzXb&id=2F44BA979606E13794CCA27A23CF018DFE6F5C3C&thid=OIP.Ge9bbzXbukNyD6kNE2AAhQHaE8&mediaurl=https://www.automationtestinghub.com/images/playwright/playwright-testing-tutorial.png&q=playwright&ck=99DB87AAFCAF10D04F6C8E21464424E4&idpp=rc&expw=672&exph=448&form=rc2idp
      - link "AutomationTestingHub":
        - /url: https://www.bing.com/ck/a?!&&p=86eb95a25f4cff2ffb77678c1c044aa9cf773da9daee0d3a90e9d868dfda0bb2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cuYXV0b21hdGlvbnRlc3RpbmdodWIuY29tL3BsYXl3cmlnaHQtYXV0b21hdGlvbi10ZXN0aW5nLXR1dG9yaWFsLw&ntb=1
        - img "Global web icon"
        - text: AutomationTestingHub https://www.automationtestinghub.com ›
        - strong: playwright
        - text: "-autom…"
      - heading "Playwright Automation Testing Tutorial" [level=2]:
        - link "Playwright Automation Testing Tutorial":
          - /url: https://www.bing.com/ck/a?!&&p=86eb95a25f4cff2ffb77678c1c044aa9cf773da9daee0d3a90e9d868dfda0bb2JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cuYXV0b21hdGlvbnRlc3RpbmdodWIuY29tL3BsYXl3cmlnaHQtYXV0b21hdGlvbi10ZXN0aW5nLXR1dG9yaWFsLw&ntb=1
      - paragraph: Jan 22, 2026 · Playwright is an open-source framework for end-to-end web automation developed by Microsoft. You can use it to automate and test modern …
    - listitem:
      - link "Explore this image":
        - /url: /images/search?view=detailV2&ccid=M45JBaJo&id=6C2212E481F2F5094EF7C533B8FF4CDCE42417A6&thid=OIP.M45JBaJoTKluCMd4D8aEEgHaD4&mediaurl=https://static-production.npmjs.com/a12c728e90758ccd16976b394b964317.png&q=playwright&ck=110315DDE65D9C0A5AEEDB1C4171F148&idpp=rc&expw=1200&exph=630&form=rc2idp
      - link "npm":
        - /url: https://www.bing.com/ck/a?!&&p=17923796257eddeff35567406fc8ea969c09a2fd3417eda2bf8a7382b41e32d4JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cubnBtanMuY29tL3BhY2thZ2UvcGxheXdyaWdodA&ntb=1
        - img "Global web icon"
        - text: npm https://www.
        - strong: npm
        - text: js.com › package ›
        - strong: playwright
      - heading "Playwright - npm" [level=2]:
        - link "Playwright - npm":
          - /url: https://www.bing.com/ck/a?!&&p=17923796257eddeff35567406fc8ea969c09a2fd3417eda2bf8a7382b41e32d4JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cubnBtanMuY29tL3BhY2thZ2UvcGxheXdyaWdodA&ntb=1
      - paragraph: Playwright is a framework for web automation and testing. It drives Chromium, Firefox, and WebKit with a single API — in your tests, in your scripts, and as a …
    - listitem:
      - link "Explore this image":
        - /url: /images/search?view=detailV2&ccid=34NkKOMI&id=18CD01550229A413A337EE1D807643DB78849783&thid=OIP.34NkKOMIus5Fi8URQK6VYwHaDj&mediaurl=https://www.toolsqa.com/gallery/playwrite/1. stateofjs_playwright_popularity.jpg&q=playwright&ck=B48A231E5DC9D11ABAD443591B0CACB7&idpp=rc&expw=1800&exph=865&form=rc2idp
      - link "Tools QA":
        - /url: https://www.bing.com/ck/a?!&&p=79592b9942df4b26cbdbce466357c2b7bf624e9ca9773954ca74939d842fdbc7JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cudG9vbHNxYS5jb20vcGxheXdyaXRlL3NvZnR3YXJlLXRlc3RpbmcvaW50cm9kdWN0aW9uLXRvLXRoZS1wbGF5d3JpZ2h0&ntb=1
        - img "Global web icon"
        - text: Tools QA https://www.toolsqa.com › ... › introduction-to-the-
        - strong: playwright
      - heading "Introduction to the Playwright Framework - Tools QA" [level=2]:
        - link "Introduction to the Playwright Framework - Tools QA":
          - /url: https://www.bing.com/ck/a?!&&p=79592b9942df4b26cbdbce466357c2b7bf624e9ca9773954ca74939d842fdbc7JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cHM6Ly93d3cudG9vbHNxYS5jb20vcGxheXdyaXRlL3NvZnR3YXJlLXRlc3RpbmcvaW50cm9kdWN0aW9uLXRvLXRoZS1wbGF5d3JpZ2h0&ntb=1
      - paragraph: Oct 1, 2023 · What is Playwright framework and why does it exists today? Explore scenarios where Playwright works as a savior for a tester.
    - listitem:
      - heading "Deep dive into playwright" [level=2]:
        - text: Deep dive into
        - strong: playwright
      - list:
        - listitem:
          - link "playwright python":
            - /url: https://www.bing.com/ck/a?!&&p=be1c1eab81eebe4d984cbac1ac7f2e4a5124d9d64051ca9bcad7bad41ff1f189JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrcHl0aG9uJkZPUk09UVNSRTE&ntb=1
            - text: playwright
            - strong: python
        - listitem:
          - link "playwright download for windows":
            - /url: https://www.bing.com/ck/a?!&&p=78928684a93663060705b9084fb523ed7a7f58b109a094994d4fd0fdd2c29a02JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrZG93bmxvYWQrZm9yK1dpbmRvd3MmRk9STT1RU1JFMg&ntb=1
            - text: playwright
            - strong: download for windows
        - listitem:
          - link "playwright github repository":
            - /url: https://www.bing.com/ck/a?!&&p=4aab856f33af2df26d74cb0dd73ed1208fa79b3c73e18b22acfe96de44d169b7JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrR2l0SHViK3JlcG9zaXRvcnkmRk9STT1RU1JFMw&ntb=1
            - text: playwright
            - strong: github repository
        - listitem:
          - link "playwright selenium comparison":
            - /url: https://www.bing.com/ck/a?!&&p=7039b620e3fd96135b1a662328ff6d256de11f925c850735aef6928c044ca8e9JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrc2VsZW5pdW0rY29tcGFyaXNvbiZGT1JNPVFTUkU0&ntb=1
            - text: playwright
            - strong: selenium comparison
        - listitem:
          - link "playwright vs allure testing":
            - /url: https://www.bing.com/ck/a?!&&p=5fb2847b01ec773a896b61bc4816170865870012518ee53955268023d0077ee6JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrdnMrYWxsdXJlK3Rlc3RpbmcmRk9STT1RU1JFNQ&ntb=1
            - text: playwright
            - strong: vs allure testing
        - listitem:
          - link "playwright tutorial for beginners":
            - /url: https://www.bing.com/ck/a?!&&p=248b84b20180bce560826729d50f3512f19fe1272922da84728fa13cb495cc82JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrdHV0b3JpYWwrZm9yK2JlZ2lubmVycyZGT1JNPVFTUkU2&ntb=1
            - text: playwright
            - strong: tutorial for beginners
        - listitem:
          - link "playwright automation":
            - /url: https://www.bing.com/ck/a?!&&p=8b16328abd464b26e94d232f76b98f550530464048ad5eb0867b617403cb079fJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrYXV0b21hdGlvbiZGT1JNPVFTUkU3&ntb=1
            - text: playwright
            - strong: automation
        - listitem:
          - link "playwright download":
            - /url: https://www.bing.com/ck/a?!&&p=5934a23d5d7450675da6ccc17db11bee452952ea541f67b4909cdf01a6576d93JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrZG93bmxvYWQmRk9STT1RU1JFOA&ntb=1
            - text: playwright
            - strong: download
    - listitem:
      - link "Some results have been removed":
        - /url: https://www.bing.com/ck/a?!&&p=27605a72c369379023520b0ef7d88ba57a8a124014c6df1c0311cda600af9f73JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cDovL2dvLm1pY3Jvc29mdC5jb20vZndsaW5rLz9MaW5rSUQ9NjE3MzUw&ntb=1
    - listitem:
      - navigation "More results for playwright":
        - list:
          - listitem
          - listitem: "1"
          - listitem:
            - link "Page 2":
              - /url: /search?q=playwright&FPIG=FC60A9725D66461181F71635B42C4BB0&first=9&FORM=PERE
              - text: "2"
          - listitem:
            - link "Page 3":
              - /url: /search?q=playwright&FPIG=FC60A9725D66461181F71635B42C4BB0&first=19&FORM=PERE1
              - text: "3"
          - listitem:
            - link "Next page":
              - /url: /search?q=playwright&FPIG=FC60A9725D66461181F71635B42C4BB0&first=9&FORM=PORE
  - complementary "Additional Results":
    - list:
      - listitem:
        - heading "Deep dive into playwright" [level=2]:
          - text: Deep dive into
          - strong: playwright
        - link "playwright python":
          - /url: https://www.bing.com/ck/a?!&&p=ffa091328a014be6d82ecb22330c1d0f80d2c0c6d7c037ae22bcdfcb206cfafeJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrcHl0aG9uJkZPUk09UjVGRA&ntb=1
          - text: playwright
          - strong: python
        - link "playwright download for windows":
          - /url: https://www.bing.com/ck/a?!&&p=4d1288d5a594232ab31161bba327551f7da5ca8e77011579d26aa07567fa9d76JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrZG93bmxvYWQrZm9yK1dpbmRvd3MmRk9STT1SNUZEMQ&ntb=1
          - text: playwright
          - strong: download for windows
        - link "playwright github repository":
          - /url: https://www.bing.com/ck/a?!&&p=3da84f51766e9e4fd7d5d55657c6344aa91523a999e00b6ef332396252d5b01dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrR2l0SHViK3JlcG9zaXRvcnkmRk9STT1SNUZEMg&ntb=1
          - text: playwright
          - strong: github repository
        - link "playwright selenium comparison":
          - /url: https://www.bing.com/ck/a?!&&p=b480f94340e4d966ff9be1679db13a9a1b1806fca6c881f19a4b9254d8de255cJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrc2VsZW5pdW0rY29tcGFyaXNvbiZGT1JNPVI1RkQz&ntb=1
          - text: playwright
          - strong: selenium comparison
        - link "playwright vs allure testing":
          - /url: https://www.bing.com/ck/a?!&&p=20024bec9bd139015a79ef90fc6948a770cde0bed7fa09438277b6745f4b7556JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrdnMrYWxsdXJlK3Rlc3RpbmcmRk9STT1SNUZENA&ntb=1
          - text: playwright
          - strong: vs allure testing
        - link "playwright tutorial for beginners":
          - /url: https://www.bing.com/ck/a?!&&p=db85dc65096b99090fb4f8407f76ee99c0adf9c3b61733fcd909586b9a449c4dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrdHV0b3JpYWwrZm9yK2JlZ2lubmVycyZGT1JNPVI1RkQ1&ntb=1
          - text: playwright
          - strong: tutorial for beginners
        - link "playwright automation":
          - /url: https://www.bing.com/ck/a?!&&p=5564b3fc9b45000fe4f3f3cc716734d966df1aff12d00bbf111c6172e2a3602aJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrYXV0b21hdGlvbiZGT1JNPVI1RkQ2&ntb=1
          - text: playwright
          - strong: automation
        - link "playwright download":
          - /url: https://www.bing.com/ck/a?!&&p=86a2dc7c161239ba49ef41f24a0efe733dd0a7a13f036579dd0a5a383fa6e2e8JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1L3NlYXJjaD9xPXBsYXl3cmlnaHQrZG93bmxvYWQmRk9STT1SNUZENw&ntb=1
          - text: playwright
          - strong: download
- contentinfo:
  - list:
    - listitem:
      - link "Privacy":
        - /url: https://www.bing.com/ck/a?!&&p=daab12c8f9892c60c1359d9589d154f63c7a7b4e0d39a8c7cf19946a7322c47dJmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cDovL2dvLm1pY3Jvc29mdC5jb20vZndsaW5rLz9MaW5rSWQ9NTIxODM5&ntb=1
    - listitem:
      - link "Terms":
        - /url: https://www.bing.com/ck/a?!&&p=e05aa45481fd6af4da65b22cad174677a16cd8e6b24f5cd1f2b2a32b9615ac94JmltdHM9MTc4Mjg2NDAwMA&ptn=3&ver=2&hsh=4&fclid=36ab0334-e9f5-67cd-00bb-14bde80c66c6&u=a1aHR0cDovL2dvLm1pY3Jvc29mdC5jb20vZndsaW5rLz9MaW5rSUQ9MjQ2MzM4&ntb=1
```

# Test source

```ts
  1  | import {test,expect} from '@playwright/test'
  2  | 
  3  | const keyword = {"searchitem":"playwright"};
  4  | 
  5  | test('Commands test',async({page})=>{
  6  | 
  7  |     await page.goto(process.env.base_url!);
  8  | 
  9  |     const title = await page.title();
  10 |     console.log("Title:",title);
  11 | 
  12 |     console.log("-------------------------------------");
  13 | 
  14 |     const current_url = page.url();
  15 |     console.log("Current Url:",current_url);
  16 | 
  17 |     console.log("-------------------------------------");
  18 | 
  19 |     expect (page).toHaveTitle("Search - Microsoft Bing");
  20 |     expect (page).toHaveURL("https://www.bing.com/");
  21 | 
  22 |     const innercontent = await page.getByRole("link",{name:"Images"}).textContent();
  23 |     console.log("Inner Text of Images link:",innercontent);
  24 |     console.log("-------------------------------------");
  25 | 
  26 |     console.log("Attributes value of search tab:");
  27 |     const search = page.locator("//textarea[@name='q']");
  28 |     console.log("Placeholder:",await search.getAttribute("placeholder"));
  29 |     console.log("Aria label:",await search.getAttribute("aria-label"));
  30 |     console.log("Class:",await search.getAttribute("class"));
  31 |     console.log("Id:",await search.getAttribute("id"));
  32 |     console.log("Role:",await search.getAttribute("role"));
  33 |     console.log("-------------------------------------");
  34 | 
  35 |     console.log("Search function:");
  36 |     await search.fill(keyword.searchitem);
  37 |     await search.press("Enter");
  38 |     await page.locator("//div[@class='slide wptSld rowSpan4 colSpan5']/child::div[2]/descendant::a[1]").click();
> 39 |     expect(page).toHaveTitle("Playwright");
     |                  ^ Error: expect(page).toHaveTitle(expected) failed
  40 |     console.log("Title:",await page.title());
  41 | })
```