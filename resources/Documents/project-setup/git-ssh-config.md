The error message you're seeing (`Permission denied (publickey)`) occurs when Git cannot authenticate your SSH key with GitHub. This is usually because the SSH key is not correctly set up or linked to your GitHub account.

### Here are the steps to resolve the issue:

#### 1. **Check if you have an existing SSH key**
Run the following command to see if you already have an SSH key on your system:
```bash
ls -al ~/.ssh
```
If you see files like `id_rsa` or `id_ecdsa`, you likely already have an SSH key. If not, you'll need to generate one.

#### 2. **Generate a new SSH key (if you don’t have one)**
If you don’t have an SSH key, generate one with the following command:
```bash
ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
```
- Press Enter to accept the default location for storing the key.
- You can also set a passphrase, but this is optional.

#### 3. **Add the SSH key to the SSH agent**
After generating the key, you need to add it to the SSH agent:
```bash
eval "$(ssh-agent -s)"
ssh-add ~/.ssh/id_rsa
```

#### 4. **Add the SSH key to your GitHub account**
Now, copy your SSH key to your clipboard:
```bash
cat ~/.ssh/id_rsa.pub
```
Copy the output, then:
- Go to **GitHub**.
- Click on your profile picture in the top-right corner, then go to **Settings**.
- In the left sidebar, click **SSH and GPG keys**.
- Click **New SSH key**, give it a title, and paste your key in the "Key" field.
- Click **Add SSH key**.

#### 5. **Test the SSH connection**
Run the following command to test if your SSH setup is correct:
```bash
ssh -T git@github.com
```
You should see a message like this if it’s successful:
```
Hi username! You've successfully authenticated, but GitHub does not provide shell access.
```

#### 6. **Clone the repository again**
Now that your SSH key is linked to GitHub, try cloning the repository again:
```bash
git clone git@github.com:2124dc/cv-owner-microservice.git
```

Let me know if you encounter any issues during the process!
