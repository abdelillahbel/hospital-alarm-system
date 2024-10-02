import simpleGit from 'simple-git';
import randomstring from 'randomstring';
import { Octokit } from '@octokit/rest';

const git = simpleGit();
const octokit = new Octokit({
    auth: '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', // Replace with your GitHub token
});

const owner = 'abdelillahbel'; // Replace with your GitHub username
const repo = 'hospital-alarm-system';  // Replace with your repository name

async function shouldCreateTask(probability) {
    return Math.random() < probability;
}

async function createIssuesWithCodeReviews() {
    const startYear = 2024;
    const endYear = 2024;
    const months = Array.from({ length: 5 }, (_, i) => i + 3);
    const days = Array.from({ length: 28 }, (_, i) => i + 1);
    const skipProbability = 0.4;

    for (let year = startYear; year <= endYear; year++) {
        for (const month of months) {
            for (const day of days) {
                const shouldTask = await shouldCreateTask(1 - skipProbability);

                if (shouldTask) {
                    const issueTitle = `Issue for ${year}-${month}-${day}: ${randomstring.generate()}`;
                    const codeChange = `// Sample code for ${issueTitle}\nconst example = 'This is a code example.';`;

                    // Create an issue with the code snippet
                    const { data: issue } = await octokit.rest.issues.create({
                        owner,
                        repo,
                        title: issueTitle,
                        body: `This issue includes a code snippet:\n\n\`\`\`javascript\n${codeChange}\n\`\`\`\n\nPlease review the code above.`,
                    });

                    console.log(`Issue #${issue.number} created: ${issue.html_url}`);

                    // Request a code review
                    await octokit.rest.issues.createComment({
                        owner,
                        repo,
                        issue_number: issue.number,
                        body: `@benkahina Please review this code snippet in the issue.`, // Replace with actual reviewers
                    });

                    console.log(`Requested a code review for Issue #${issue.number}.`);
                }
            }
        }
    }

    console.log('All tasks completed.');
}

createIssuesWithCodeReviews();
